package com.optimussoftware.db;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ADVERTISING".
*/
public class AdvertisingDao extends AbstractDao<Advertising, String> {

    public static final String TABLENAME = "ADVERTISING";

    /**
     * Properties of entity Advertising.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, String.class, "_id", true, "_ID");
        public final static Property _etag = new Property(1, String.class, "_etag", false, "_ETAG");
        public final static Property Created = new Property(2, java.util.Date.class, "created", false, "CREATED");
        public final static Property Updated = new Property(3, java.util.Date.class, "updated", false, "UPDATED");
        public final static Property Active = new Property(4, Boolean.class, "active", false, "ACTIVE");
        public final static Property Deleted = new Property(5, Boolean.class, "deleted", false, "DELETED");
        public final static Property Name = new Property(6, String.class, "name", false, "NAME");
        public final static Property Price = new Property(7, Double.class, "price", false, "PRICE");
        public final static Property Description = new Property(8, String.class, "description", false, "DESCRIPTION");
        public final static Property Is_homepage = new Property(9, Boolean.class, "is_homepage", false, "IS_HOMEPAGE");
        public final static Property Count_likes = new Property(10, Integer.class, "count_likes", false, "COUNT_LIKES");
        public final static Property Count_dislikes = new Property(11, Integer.class, "count_dislikes", false, "COUNT_DISLIKES");
        public final static Property Count_votes = new Property(12, Integer.class, "count_votes", false, "COUNT_VOTES");
        public final static Property Acum_votes = new Property(13, Integer.class, "acum_votes", false, "ACUM_VOTES");
        public final static Property Location_id = new Property(14, String.class, "location_id", false, "LOCATION_ID");
        public final static Property Campaign_id = new Property(15, String.class, "campaign_id", false, "CAMPAIGN_ID");
        public final static Property Device_id = new Property(16, String.class, "device_id", false, "DEVICE_ID");
    }

    private DaoSession daoSession;

    private Query<Advertising> campaign_TheCampaignAdvertisingQuery;
    private Query<Advertising> devices_TheDeviceAdvertisingQuery;

    public AdvertisingDao(DaoConfig config) {
        super(config);
    }
    
    public AdvertisingDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ADVERTISING\" (" + //
                "\"_ID\" TEXT PRIMARY KEY NOT NULL UNIQUE ," + // 0: _id
                "\"_ETAG\" TEXT," + // 1: _etag
                "\"CREATED\" INTEGER," + // 2: created
                "\"UPDATED\" INTEGER," + // 3: updated
                "\"ACTIVE\" INTEGER," + // 4: active
                "\"DELETED\" INTEGER," + // 5: deleted
                "\"NAME\" TEXT," + // 6: name
                "\"PRICE\" REAL," + // 7: price
                "\"DESCRIPTION\" TEXT," + // 8: description
                "\"IS_HOMEPAGE\" INTEGER," + // 9: is_homepage
                "\"COUNT_LIKES\" INTEGER," + // 10: count_likes
                "\"COUNT_DISLIKES\" INTEGER," + // 11: count_dislikes
                "\"COUNT_VOTES\" INTEGER," + // 12: count_votes
                "\"ACUM_VOTES\" INTEGER," + // 13: acum_votes
                "\"LOCATION_ID\" TEXT," + // 14: location_id
                "\"CAMPAIGN_ID\" TEXT," + // 15: campaign_id
                "\"DEVICE_ID\" TEXT);"); // 16: device_id
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ADVERTISING\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Advertising entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.get_id());
 
        String _etag = entity.get_etag();
        if (_etag != null) {
            stmt.bindString(2, _etag);
        }
 
        java.util.Date created = entity.getCreated();
        if (created != null) {
            stmt.bindLong(3, created.getTime());
        }
 
        java.util.Date updated = entity.getUpdated();
        if (updated != null) {
            stmt.bindLong(4, updated.getTime());
        }
 
        Boolean active = entity.getActive();
        if (active != null) {
            stmt.bindLong(5, active ? 1L: 0L);
        }
 
        Boolean deleted = entity.getDeleted();
        if (deleted != null) {
            stmt.bindLong(6, deleted ? 1L: 0L);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(7, name);
        }
 
        Double price = entity.getPrice();
        if (price != null) {
            stmt.bindDouble(8, price);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(9, description);
        }
 
        Boolean is_homepage = entity.getIs_homepage();
        if (is_homepage != null) {
            stmt.bindLong(10, is_homepage ? 1L: 0L);
        }
 
        Integer count_likes = entity.getCount_likes();
        if (count_likes != null) {
            stmt.bindLong(11, count_likes);
        }
 
        Integer count_dislikes = entity.getCount_dislikes();
        if (count_dislikes != null) {
            stmt.bindLong(12, count_dislikes);
        }
 
        Integer count_votes = entity.getCount_votes();
        if (count_votes != null) {
            stmt.bindLong(13, count_votes);
        }
 
        Integer acum_votes = entity.getAcum_votes();
        if (acum_votes != null) {
            stmt.bindLong(14, acum_votes);
        }
 
        String location_id = entity.getLocation_id();
        if (location_id != null) {
            stmt.bindString(15, location_id);
        }
 
        String campaign_id = entity.getCampaign_id();
        if (campaign_id != null) {
            stmt.bindString(16, campaign_id);
        }
 
        String device_id = entity.getDevice_id();
        if (device_id != null) {
            stmt.bindString(17, device_id);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Advertising entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.get_id());
 
        String _etag = entity.get_etag();
        if (_etag != null) {
            stmt.bindString(2, _etag);
        }
 
        java.util.Date created = entity.getCreated();
        if (created != null) {
            stmt.bindLong(3, created.getTime());
        }
 
        java.util.Date updated = entity.getUpdated();
        if (updated != null) {
            stmt.bindLong(4, updated.getTime());
        }
 
        Boolean active = entity.getActive();
        if (active != null) {
            stmt.bindLong(5, active ? 1L: 0L);
        }
 
        Boolean deleted = entity.getDeleted();
        if (deleted != null) {
            stmt.bindLong(6, deleted ? 1L: 0L);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(7, name);
        }
 
        Double price = entity.getPrice();
        if (price != null) {
            stmt.bindDouble(8, price);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(9, description);
        }
 
        Boolean is_homepage = entity.getIs_homepage();
        if (is_homepage != null) {
            stmt.bindLong(10, is_homepage ? 1L: 0L);
        }
 
        Integer count_likes = entity.getCount_likes();
        if (count_likes != null) {
            stmt.bindLong(11, count_likes);
        }
 
        Integer count_dislikes = entity.getCount_dislikes();
        if (count_dislikes != null) {
            stmt.bindLong(12, count_dislikes);
        }
 
        Integer count_votes = entity.getCount_votes();
        if (count_votes != null) {
            stmt.bindLong(13, count_votes);
        }
 
        Integer acum_votes = entity.getAcum_votes();
        if (acum_votes != null) {
            stmt.bindLong(14, acum_votes);
        }
 
        String location_id = entity.getLocation_id();
        if (location_id != null) {
            stmt.bindString(15, location_id);
        }
 
        String campaign_id = entity.getCampaign_id();
        if (campaign_id != null) {
            stmt.bindString(16, campaign_id);
        }
 
        String device_id = entity.getDevice_id();
        if (device_id != null) {
            stmt.bindString(17, device_id);
        }
    }

    @Override
    protected final void attachEntity(Advertising entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    @Override
    public Advertising readEntity(Cursor cursor, int offset) {
        Advertising entity = new Advertising( //
            cursor.getString(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // _etag
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // created
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // updated
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // active
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0, // deleted
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // name
            cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7), // price
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // description
            cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0, // is_homepage
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // count_likes
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // count_dislikes
            cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12), // count_votes
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // acum_votes
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // location_id
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // campaign_id
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16) // device_id
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Advertising entity, int offset) {
        entity.set_id(cursor.getString(offset + 0));
        entity.set_etag(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCreated(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setUpdated(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setActive(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setDeleted(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
        entity.setName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPrice(cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7));
        entity.setDescription(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setIs_homepage(cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0);
        entity.setCount_likes(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setCount_dislikes(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setCount_votes(cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12));
        entity.setAcum_votes(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setLocation_id(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCampaign_id(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setDevice_id(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
     }
    
    @Override
    protected final String updateKeyAfterInsert(Advertising entity, long rowId) {
        return entity.get_id();
    }
    
    @Override
    public String getKey(Advertising entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Advertising entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "theCampaignAdvertising" to-many relationship of Campaign. */
    public List<Advertising> _queryCampaign_TheCampaignAdvertising(String campaign_id) {
        synchronized (this) {
            if (campaign_TheCampaignAdvertisingQuery == null) {
                QueryBuilder<Advertising> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Campaign_id.eq(null));
                campaign_TheCampaignAdvertisingQuery = queryBuilder.build();
            }
        }
        Query<Advertising> query = campaign_TheCampaignAdvertisingQuery.forCurrentThread();
        query.setParameter(0, campaign_id);
        return query.list();
    }

    /** Internal query to resolve the "theDeviceAdvertising" to-many relationship of Devices. */
    public List<Advertising> _queryDevices_TheDeviceAdvertising(String device_id) {
        synchronized (this) {
            if (devices_TheDeviceAdvertisingQuery == null) {
                QueryBuilder<Advertising> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Device_id.eq(null));
                devices_TheDeviceAdvertisingQuery = queryBuilder.build();
            }
        }
        Query<Advertising> query = devices_TheDeviceAdvertisingQuery.forCurrentThread();
        query.setParameter(0, device_id);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getCampaignDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getDevicesDao().getAllColumns());
            builder.append(" FROM ADVERTISING T");
            builder.append(" LEFT JOIN CAMPAIGN T0 ON T.\"CAMPAIGN_ID\"=T0.\"_ID\"");
            builder.append(" LEFT JOIN DEVICES T1 ON T.\"DEVICE_ID\"=T1.\"_ID\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Advertising loadCurrentDeep(Cursor cursor, boolean lock) {
        Advertising entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Campaign TheAvertisings = loadCurrentOther(daoSession.getCampaignDao(), cursor, offset);
        entity.setTheAvertisings(TheAvertisings);
        offset += daoSession.getCampaignDao().getAllColumns().length;

        Devices theAdvertising = loadCurrentOther(daoSession.getDevicesDao(), cursor, offset);
        entity.setTheAdvertising(theAdvertising);

        return entity;    
    }

    public Advertising loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Advertising> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Advertising> list = new ArrayList<Advertising>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Advertising> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Advertising> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
