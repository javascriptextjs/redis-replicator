package com.moilioncircle.redis.replicator.rdb.datatype;

/**
 * Created by Administrator on 2017/1/31.
 */
public interface Module {
    String moduleName();

    int moduleVersion();

    <T> T loadFromRdb();
}