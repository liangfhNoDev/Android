package com.optimussoftware.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.optimussoftware.db.User;
import com.optimussoftware.db.Advertising;
import com.optimussoftware.db.Image;
import com.optimussoftware.db.Interest;
import com.optimussoftware.db.UserInterest;
import com.optimussoftware.db.Visit;
import com.optimussoftware.db.Likes;
import com.optimussoftware.db.Dislikes;
import com.optimussoftware.db.Favorites;
import com.optimussoftware.db.Notification;
import com.optimussoftware.db.Campaign;
import com.optimussoftware.db.Location;
import com.optimussoftware.db.Review;
import com.optimussoftware.db.Devices;
import com.optimussoftware.db.AdvertisingImage;
import com.optimussoftware.db.AdvertisingInterest;
import com.optimussoftware.db.NotificationAdvertising;

import com.optimussoftware.db.UserDao;
import com.optimussoftware.db.AdvertisingDao;
import com.optimussoftware.db.ImageDao;
import com.optimussoftware.db.InterestDao;
import com.optimussoftware.db.UserInterestDao;
import com.optimussoftware.db.VisitDao;
import com.optimussoftware.db.LikesDao;
import com.optimussoftware.db.DislikesDao;
import com.optimussoftware.db.FavoritesDao;
import com.optimussoftware.db.NotificationDao;
import com.optimussoftware.db.CampaignDao;
import com.optimussoftware.db.LocationDao;
import com.optimussoftware.db.ReviewDao;
import com.optimussoftware.db.DevicesDao;
import com.optimussoftware.db.AdvertisingImageDao;
import com.optimussoftware.db.AdvertisingInterestDao;
import com.optimussoftware.db.NotificationAdvertisingDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userDaoConfig;
    private final DaoConfig advertisingDaoConfig;
    private final DaoConfig imageDaoConfig;
    private final DaoConfig interestDaoConfig;
    private final DaoConfig userInterestDaoConfig;
    private final DaoConfig visitDaoConfig;
    private final DaoConfig likesDaoConfig;
    private final DaoConfig dislikesDaoConfig;
    private final DaoConfig favoritesDaoConfig;
    private final DaoConfig notificationDaoConfig;
    private final DaoConfig campaignDaoConfig;
    private final DaoConfig locationDaoConfig;
    private final DaoConfig reviewDaoConfig;
    private final DaoConfig devicesDaoConfig;
    private final DaoConfig advertisingImageDaoConfig;
    private final DaoConfig advertisingInterestDaoConfig;
    private final DaoConfig notificationAdvertisingDaoConfig;

    private final UserDao userDao;
    private final AdvertisingDao advertisingDao;
    private final ImageDao imageDao;
    private final InterestDao interestDao;
    private final UserInterestDao userInterestDao;
    private final VisitDao visitDao;
    private final LikesDao likesDao;
    private final DislikesDao dislikesDao;
    private final FavoritesDao favoritesDao;
    private final NotificationDao notificationDao;
    private final CampaignDao campaignDao;
    private final LocationDao locationDao;
    private final ReviewDao reviewDao;
    private final DevicesDao devicesDao;
    private final AdvertisingImageDao advertisingImageDao;
    private final AdvertisingInterestDao advertisingInterestDao;
    private final NotificationAdvertisingDao notificationAdvertisingDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        advertisingDaoConfig = daoConfigMap.get(AdvertisingDao.class).clone();
        advertisingDaoConfig.initIdentityScope(type);

        imageDaoConfig = daoConfigMap.get(ImageDao.class).clone();
        imageDaoConfig.initIdentityScope(type);

        interestDaoConfig = daoConfigMap.get(InterestDao.class).clone();
        interestDaoConfig.initIdentityScope(type);

        userInterestDaoConfig = daoConfigMap.get(UserInterestDao.class).clone();
        userInterestDaoConfig.initIdentityScope(type);

        visitDaoConfig = daoConfigMap.get(VisitDao.class).clone();
        visitDaoConfig.initIdentityScope(type);

        likesDaoConfig = daoConfigMap.get(LikesDao.class).clone();
        likesDaoConfig.initIdentityScope(type);

        dislikesDaoConfig = daoConfigMap.get(DislikesDao.class).clone();
        dislikesDaoConfig.initIdentityScope(type);

        favoritesDaoConfig = daoConfigMap.get(FavoritesDao.class).clone();
        favoritesDaoConfig.initIdentityScope(type);

        notificationDaoConfig = daoConfigMap.get(NotificationDao.class).clone();
        notificationDaoConfig.initIdentityScope(type);

        campaignDaoConfig = daoConfigMap.get(CampaignDao.class).clone();
        campaignDaoConfig.initIdentityScope(type);

        locationDaoConfig = daoConfigMap.get(LocationDao.class).clone();
        locationDaoConfig.initIdentityScope(type);

        reviewDaoConfig = daoConfigMap.get(ReviewDao.class).clone();
        reviewDaoConfig.initIdentityScope(type);

        devicesDaoConfig = daoConfigMap.get(DevicesDao.class).clone();
        devicesDaoConfig.initIdentityScope(type);

        advertisingImageDaoConfig = daoConfigMap.get(AdvertisingImageDao.class).clone();
        advertisingImageDaoConfig.initIdentityScope(type);

        advertisingInterestDaoConfig = daoConfigMap.get(AdvertisingInterestDao.class).clone();
        advertisingInterestDaoConfig.initIdentityScope(type);

        notificationAdvertisingDaoConfig = daoConfigMap.get(NotificationAdvertisingDao.class).clone();
        notificationAdvertisingDaoConfig.initIdentityScope(type);

        userDao = new UserDao(userDaoConfig, this);
        advertisingDao = new AdvertisingDao(advertisingDaoConfig, this);
        imageDao = new ImageDao(imageDaoConfig, this);
        interestDao = new InterestDao(interestDaoConfig, this);
        userInterestDao = new UserInterestDao(userInterestDaoConfig, this);
        visitDao = new VisitDao(visitDaoConfig, this);
        likesDao = new LikesDao(likesDaoConfig, this);
        dislikesDao = new DislikesDao(dislikesDaoConfig, this);
        favoritesDao = new FavoritesDao(favoritesDaoConfig, this);
        notificationDao = new NotificationDao(notificationDaoConfig, this);
        campaignDao = new CampaignDao(campaignDaoConfig, this);
        locationDao = new LocationDao(locationDaoConfig, this);
        reviewDao = new ReviewDao(reviewDaoConfig, this);
        devicesDao = new DevicesDao(devicesDaoConfig, this);
        advertisingImageDao = new AdvertisingImageDao(advertisingImageDaoConfig, this);
        advertisingInterestDao = new AdvertisingInterestDao(advertisingInterestDaoConfig, this);
        notificationAdvertisingDao = new NotificationAdvertisingDao(notificationAdvertisingDaoConfig, this);

        registerDao(User.class, userDao);
        registerDao(Advertising.class, advertisingDao);
        registerDao(Image.class, imageDao);
        registerDao(Interest.class, interestDao);
        registerDao(UserInterest.class, userInterestDao);
        registerDao(Visit.class, visitDao);
        registerDao(Likes.class, likesDao);
        registerDao(Dislikes.class, dislikesDao);
        registerDao(Favorites.class, favoritesDao);
        registerDao(Notification.class, notificationDao);
        registerDao(Campaign.class, campaignDao);
        registerDao(Location.class, locationDao);
        registerDao(Review.class, reviewDao);
        registerDao(Devices.class, devicesDao);
        registerDao(AdvertisingImage.class, advertisingImageDao);
        registerDao(AdvertisingInterest.class, advertisingInterestDao);
        registerDao(NotificationAdvertising.class, notificationAdvertisingDao);
    }
    
    public void clear() {
        userDaoConfig.clearIdentityScope();
        advertisingDaoConfig.clearIdentityScope();
        imageDaoConfig.clearIdentityScope();
        interestDaoConfig.clearIdentityScope();
        userInterestDaoConfig.clearIdentityScope();
        visitDaoConfig.clearIdentityScope();
        likesDaoConfig.clearIdentityScope();
        dislikesDaoConfig.clearIdentityScope();
        favoritesDaoConfig.clearIdentityScope();
        notificationDaoConfig.clearIdentityScope();
        campaignDaoConfig.clearIdentityScope();
        locationDaoConfig.clearIdentityScope();
        reviewDaoConfig.clearIdentityScope();
        devicesDaoConfig.clearIdentityScope();
        advertisingImageDaoConfig.clearIdentityScope();
        advertisingInterestDaoConfig.clearIdentityScope();
        notificationAdvertisingDaoConfig.clearIdentityScope();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public AdvertisingDao getAdvertisingDao() {
        return advertisingDao;
    }

    public ImageDao getImageDao() {
        return imageDao;
    }

    public InterestDao getInterestDao() {
        return interestDao;
    }

    public UserInterestDao getUserInterestDao() {
        return userInterestDao;
    }

    public VisitDao getVisitDao() {
        return visitDao;
    }

    public LikesDao getLikesDao() {
        return likesDao;
    }

    public DislikesDao getDislikesDao() {
        return dislikesDao;
    }

    public FavoritesDao getFavoritesDao() {
        return favoritesDao;
    }

    public NotificationDao getNotificationDao() {
        return notificationDao;
    }

    public CampaignDao getCampaignDao() {
        return campaignDao;
    }

    public LocationDao getLocationDao() {
        return locationDao;
    }

    public ReviewDao getReviewDao() {
        return reviewDao;
    }

    public DevicesDao getDevicesDao() {
        return devicesDao;
    }

    public AdvertisingImageDao getAdvertisingImageDao() {
        return advertisingImageDao;
    }

    public AdvertisingInterestDao getAdvertisingInterestDao() {
        return advertisingInterestDao;
    }

    public NotificationAdvertisingDao getNotificationAdvertisingDao() {
        return notificationAdvertisingDao;
    }

}
