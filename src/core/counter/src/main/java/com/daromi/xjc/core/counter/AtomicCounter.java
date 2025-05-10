package com.daromi.xjc.core.counter;

import java.util.concurrent.atomic.AtomicInteger;

final class AtomicCounter implements ConcurrentCounter {

  private final AtomicInteger count = new AtomicInteger(0);

  @Override
  public void increment() {
    count.incrementAndGet();
  }

  @Override
  public int get() {
    return count.get();
  }
}
