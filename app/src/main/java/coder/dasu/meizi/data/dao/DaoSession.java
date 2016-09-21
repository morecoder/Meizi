package coder.dasu.meizi.data.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import coder.dasu.meizi.data.bean.Meizi;
import coder.dasu.meizi.data.bean.User;

import coder.dasu.meizi.data.dao.MeiziDao;
import coder.dasu.meizi.data.dao.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig meiziDaoConfig;
    private final DaoConfig userDaoConfig;

    private final MeiziDao meiziDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        meiziDaoConfig = daoConfigMap.get(MeiziDao.class).clone();
        meiziDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        meiziDao = new MeiziDao(meiziDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(Meizi.class, meiziDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        meiziDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public MeiziDao getMeiziDao() {
        return meiziDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
