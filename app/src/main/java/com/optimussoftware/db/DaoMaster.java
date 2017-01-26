package com.optimussoftware.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 1): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        UserDao.createTable(db, ifNotExists);
        AdvertisingDao.createTable(db, ifNotExists);
        ImageDao.createTable(db, ifNotExists);
        InterestDao.createTable(db, ifNotExists);
        UserInterestDao.createTable(db, ifNotExists);
        VisitDao.createTable(db, ifNotExists);
        LikesDao.createTable(db, ifNotExists);
        DislikesDao.createTable(db, ifNotExists);
        FavoritesDao.createTable(db, ifNotExists);
        NotificationDao.createTable(db, ifNotExists);
        CampaignDao.createTable(db, ifNotExists);
        LocationDao.createTable(db, ifNotExists);
        ReviewDao.createTable(db, ifNotExists);
        DevicesDao.createTable(db, ifNotExists);
        AdvertisingImageDao.createTable(db, ifNotExists);
        AdvertisingInterestDao.createTable(db, ifNotExists);
        NotificationAdvertisingDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        UserDao.dropTable(db, ifExists);
        AdvertisingDao.dropTable(db, ifExists);
        ImageDao.dropTable(db, ifExists);
        InterestDao.dropTable(db, ifExists);
        UserInterestDao.dropTable(db, ifExists);
        VisitDao.dropTable(db, ifExists);
        LikesDao.dropTable(db, ifExists);
        DislikesDao.dropTable(db, ifExists);
        FavoritesDao.dropTable(db, ifExists);
        NotificationDao.dropTable(db, ifExists);
        CampaignDao.dropTable(db, ifExists);
        LocationDao.dropTable(db, ifExists);
        ReviewDao.dropTable(db, ifExists);
        DevicesDao.dropTable(db, ifExists);
        AdvertisingImageDao.dropTable(db, ifExists);
        AdvertisingInterestDao.dropTable(db, ifExists);
        NotificationAdvertisingDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(UserDao.class);
        registerDaoClass(AdvertisingDao.class);
        registerDaoClass(ImageDao.class);
        registerDaoClass(InterestDao.class);
        registerDaoClass(UserInterestDao.class);
        registerDaoClass(VisitDao.class);
        registerDaoClass(LikesDao.class);
        registerDaoClass(DislikesDao.class);
        registerDaoClass(FavoritesDao.class);
        registerDaoClass(NotificationDao.class);
        registerDaoClass(CampaignDao.class);
        registerDaoClass(LocationDao.class);
        registerDaoClass(ReviewDao.class);
        registerDaoClass(DevicesDao.class);
        registerDaoClass(AdvertisingImageDao.class);
        registerDaoClass(AdvertisingInterestDao.class);
        registerDaoClass(NotificationAdvertisingDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
