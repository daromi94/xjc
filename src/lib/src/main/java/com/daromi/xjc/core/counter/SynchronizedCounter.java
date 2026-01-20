package com.daromi.xjc.core.counter;

final class SynchronizedCounter implements ConcurrentCounter {

  private final Object lock = new Object();
  private int count = 0;

  @Override
  public void increment() {
    synchronized (lock) {
      count++;
    }
  }

  @Override
  public int get() {
    synchronized (lock) {
      return count;
    }
  }
}
