package com.daromi.xjc.core.concurrent;

public final class SynchronizedCounter {

  private int count = 0;

  private final Object lock = new Object();

  public void increment() {
    synchronized (lock) {
      count++;
    }
  }

  public int get() {
    synchronized (lock) {
      return count;
    }
  }
}
