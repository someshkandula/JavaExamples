package com.somesh.examples.inmemorycache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InMemoryCache<K, T> {

	private long timeToLive;

	private Map<K, CacheObject> cacheMap;

	protected class CacheObject<T> {
		private long lastAccessed = System.currentTimeMillis();
		T value;

		public T getValue() {
			return value;
		}

		protected CacheObject(T value) {
			this.value = value;
		}

	}

	public InMemoryCache(final long timeToLive, final long timeToSleep, final int maxSize) {
		this.timeToLive = timeToLive * 1000;
		cacheMap = new HashMap<K, CacheObject>(maxSize);

		if (timeToLive > 0 && timeToSleep > 0) {

			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {
						try {
							Thread.sleep(timeToSleep);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						cleanup();
					}

				}
			});

			t.setDaemon(true);
			t.start();

		}
	}

	

	public void put(K key, T value) {
		synchronized (cacheMap) {
			cacheMap.put(key, new CacheObject(value));
		}
	}

	@SuppressWarnings("unused")
	public T get(K key) {
		synchronized (cacheMap) {
			@SuppressWarnings("unchecked")
			CacheObject<?> c = (CacheObject<?>) cacheMap.get(key);
			c.lastAccessed = System.currentTimeMillis();
			if (c == null) {
				return null;
			} else {
				return (T) c.getValue();
			}
		}
	}

	public void cleanup() {

		long now = System.currentTimeMillis();
		List<K> deleteKey = null;
		K key = null;
		CacheObject c = null;
		deleteKey = new ArrayList<K>();
		synchronized (cacheMap) {
			Iterator<K> itr = cacheMap.keySet().iterator();
			while (itr.hasNext()) {

				key = (K) itr.next();
				c = (CacheObject) cacheMap.get(key);

				if (now > (timeToLive + c.lastAccessed)) {
					deleteKey.add(key);
				}
			}
		}

		for (K key1 : deleteKey) {
			synchronized (cacheMap) {
				cacheMap.remove(key);
			}
		}
		//Thread.yield();
	}

	public void remove(K key) {
		synchronized (cacheMap) {
			cacheMap.remove(key);
		}
	}

	public int size() {
		synchronized (cacheMap) {
			return cacheMap.size();
		}
	}

}
