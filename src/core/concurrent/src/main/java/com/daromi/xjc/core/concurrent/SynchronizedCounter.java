package com.daromi.xjc.core.concurrent;

final class SynchronizedCounter implements ConcurrentCounter {

  private int count = 0;

  private final Object lock = new Object();

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
