package com.optimussoftware.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, String> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, String.class, "_id", true, "_ID");
        public final static Property _etag = new Property(1, String.class, "_etag", false, "_ETAG");
        public final static Property Created = new Property(2, java.util.Date.class, "created", false, "CREATED");
        public final static Property Updated = new Property(3, java.util.Date.class, "updated", false, "UPDATED");
        public final static Property Active = new Property(4, Boolean.class, "active", false, "ACTIVE");
        public final static Property Deleted = new Property(5, Boolean.class, "deleted", false, "DELETED");
        public final static Property Social_id = new Property(6, String.class, "social_id", false, "SOCIAL_ID");
        public final static Property Password = new Property(7, String.class, "password", false, "PASSWORD");
        public final static Property Email = new Property(8, String.class, "email", false, "EMAIL");
        public final static Property First_name = new Property(9, String.class, "first_name", false, "FIRST_NAME");
        public final static Property Middle_name = new Property(10, String.class, "middle_name", false, "MIDDLE_NAME");
        public final static Property Last_name = new Property(11, String.class, "last_name", false, "LAST_NAME");
        public final static Property Full_name = new Property(12, String.class, "full_name", false, "FULL_NAME");
        public final static Property Phone = new Property(13, String.class, "phone", false, "PHONE");
        public final static Property Location = new Property(14, String.class, "location", false, "LOCATION");
        public final static Property About_me = new Property(15, String.class, "about_me", false, "ABOUT_ME");
        public final static Property Gender = new Property(16, String.class, "gender", false, "GENDER");
        public final static Property Timezone = new Property(17, Integer.class, "timezone", false, "TIMEZONE");
        public final static Property Link = new Property(18, String.class, "link", false, "LINK");
        public final static Property Source = new Property(19, String.class, "source", false, "SOURCE");
        public final static Property Profile_photo = new Property(20, String.class, "profile_photo", false, "PROFILE_PHOTO");
        public final static Property Birthday = new Property(21, java.util.Date.class, "birthday", false, "BIRTHDAY");
    }

    private DaoSession daoSession;


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_ID\" TEXT PRIMARY KEY NOT NULL UNIQUE ," + // 0: _id
                "\"_ETAG\" TEXT," + // 1: _etag
                "\"CREATED\" INTEGER," + // 2: created
                "\"UPDATED\" INTEGER," + // 3: updated
                "\"ACTIVE\" INTEGER," + // 4: active
                "\"DELETED\" INTEGER," + // 5: deleted
                "\"SOCIAL_ID\" TEXT," + // 6: social_id
                "\"PASSWORD\" TEXT," + // 7: password
                "\"EMAIL\" TEXT NOT NULL ," + // 8: email
                "\"FIRST_NAME\" TEXT," + // 9: first_name
                "\"MIDDLE_NAME\" TEXT," + // 10: middle_name
                "\"LAST_NAME\" TEXT," + // 11: last_name
                "\"FULL_NAME\" TEXT," + // 12: full_name
                "\"PHONE\" TEXT," + // 13: phone
                "\"LOCATION\" TEXT," + // 14: location
                "\"ABOUT_ME\" TEXT," + // 15: about_me
                "\"GENDER\" TEXT," + // 16: gender
                "\"TIMEZONE\" INTEGER," + // 17: timezone
                "\"LINK\" TEXT," + // 18: link
                "\"SOURCE\" TEXT," + // 19: source
                "\"PROFILE_PHOTO\" TEXT," + // 20: profile_photo
                "\"BIRTHDAY\" INTEGER);"); // 21: birthday
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
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
 
        String social_id = entity.getSocial_id();
        if (social_id != null) {
            stmt.bindString(7, social_id);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(8, password);
        }
        stmt.bindString(9, entity.getEmail());
 
        String first_name = entity.getFirst_name();
        if (first_name != null) {
            stmt.bindString(10, first_name);
        }
 
        String middle_name = entity.getMiddle_name();
        if (middle_name != null) {
            stmt.bindString(11, middle_name);
        }
 
        String last_name = entity.getLast_name();
        if (last_name != null) {
            stmt.bindString(12, last_name);
        }
 
        String full_name = entity.getFull_name();
        if (full_name != null) {
            stmt.bindString(13, full_name);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(14, phone);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(15, location);
        }
 
        String about_me = entity.getAbout_me();
        if (about_me != null) {
            stmt.bindString(16, about_me);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(17, gender);
        }
 
        Integer timezone = entity.getTimezone();
        if (timezone != null) {
            stmt.bindLong(18, timezone);
        }
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(19, link);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(20, source);
        }
 
        String profile_photo = entity.getProfile_photo();
        if (profile_photo != null) {
            stmt.bindString(21, profile_photo);
        }
 
        java.util.Date birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindLong(22, birthday.getTime());
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
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
 
        String social_id = entity.getSocial_id();
        if (social_id != null) {
            stmt.bindString(7, social_id);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(8, password);
        }
        stmt.bindString(9, entity.getEmail());
 
        String first_name = entity.getFirst_name();
        if (first_name != null) {
            stmt.bindString(10, first_name);
        }
 
        String middle_name = entity.getMiddle_name();
        if (middle_name != null) {
            stmt.bindString(11, middle_name);
        }
 
        String last_name = entity.getLast_name();
        if (last_name != null) {
            stmt.bindString(12, last_name);
        }
 
        String full_name = entity.getFull_name();
        if (full_name != null) {
            stmt.bindString(13, full_name);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(14, phone);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(15, location);
        }
 
        String about_me = entity.getAbout_me();
        if (about_me != null) {
            stmt.bindString(16, about_me);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(17, gender);
        }
 
        Integer timezone = entity.getTimezone();
        if (timezone != null) {
            stmt.bindLong(18, timezone);
        }
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(19, link);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(20, source);
        }
 
        String profile_photo = entity.getProfile_photo();
        if (profile_photo != null) {
            stmt.bindString(21, profile_photo);
        }
 
        java.util.Date birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindLong(22, birthday.getTime());
        }
    }

    @Override
    protected final void attachEntity(User entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.getString(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // _etag
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // created
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // updated
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // active
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0, // deleted
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // social_id
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // password
            cursor.getString(offset + 8), // email
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // first_name
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // middle_name
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // last_name
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // full_name
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // phone
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // location
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // about_me
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // gender
            cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17), // timezone
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // link
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // source
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // profile_photo
            cursor.isNull(offset + 21) ? null : new java.util.Date(cursor.getLong(offset + 21)) // birthday
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.set_id(cursor.getString(offset + 0));
        entity.set_etag(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCreated(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setUpdated(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setActive(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setDeleted(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
        entity.setSocial_id(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPassword(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setEmail(cursor.getString(offset + 8));
        entity.setFirst_name(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setMiddle_name(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setLast_name(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setFull_name(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setPhone(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setLocation(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setAbout_me(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setGender(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setTimezone(cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17));
        entity.setLink(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setSource(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setProfile_photo(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setBirthday(cursor.isNull(offset + 21) ? null : new java.util.Date(cursor.getLong(offset + 21)));
     }
    
    @Override
    protected final String updateKeyAfterInsert(User entity, long rowId) {
        return entity.get_id();
    }
    
    @Override
    public String getKey(User entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
