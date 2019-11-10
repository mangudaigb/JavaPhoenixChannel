package com.thl.phoenixframework.channels;

public interface IMessageCallback {
    void onMessage(final Envelope envelope);
}
