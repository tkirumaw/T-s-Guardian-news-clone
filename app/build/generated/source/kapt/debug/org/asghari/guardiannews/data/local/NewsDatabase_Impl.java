package org.asghari.guardiannews.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDatabase_Impl extends NewsDatabase {
  private volatile NewsDao _newsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `NewsItems` (`apiUrl` TEXT NOT NULL, `id` TEXT NOT NULL, `isHosted` INTEGER NOT NULL, `pillarId` TEXT NOT NULL, `pillarName` TEXT NOT NULL, `sectionId` TEXT NOT NULL, `sectionName` TEXT NOT NULL, `tags` TEXT NOT NULL, `type` TEXT NOT NULL, `webPublicationDate` TEXT NOT NULL, `webTitle` TEXT NOT NULL, `webUrl` TEXT NOT NULL, `body` TEXT NOT NULL, `bodyText` TEXT NOT NULL, `byline` TEXT NOT NULL, `bylineHtml` TEXT NOT NULL, `charCount` TEXT NOT NULL, `firstPublicationDate` TEXT NOT NULL, `headline` TEXT NOT NULL, `isInappropriateForSponsorship` TEXT NOT NULL, `isLive` TEXT NOT NULL, `isPremoderated` TEXT NOT NULL, `lang` TEXT NOT NULL, `lastModified` TEXT NOT NULL, `legallySensitive` TEXT NOT NULL, `main` TEXT NOT NULL, `newspaperEditionDate` TEXT NOT NULL, `newspaperPageNumber` TEXT NOT NULL, `productionOffice` TEXT NOT NULL, `publication` TEXT NOT NULL, `shortUrl` TEXT NOT NULL, `shouldHideAdverts` TEXT NOT NULL, `shouldHideReaderRevenue` TEXT NOT NULL, `showAffiliateLinks` TEXT NOT NULL, `showInRelatedContent` TEXT NOT NULL, `standfirst` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `trailText` TEXT NOT NULL, `wordcount` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'af9f7244bb3ed07b961c89d577bfc393')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `NewsItems`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNewsItems = new HashMap<String, TableInfo.Column>(39);
        _columnsNewsItems.put("apiUrl", new TableInfo.Column("apiUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("isHosted", new TableInfo.Column("isHosted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("pillarId", new TableInfo.Column("pillarId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("pillarName", new TableInfo.Column("pillarName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("sectionId", new TableInfo.Column("sectionId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("sectionName", new TableInfo.Column("sectionName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("webPublicationDate", new TableInfo.Column("webPublicationDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("webTitle", new TableInfo.Column("webTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("webUrl", new TableInfo.Column("webUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("body", new TableInfo.Column("body", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("bodyText", new TableInfo.Column("bodyText", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("byline", new TableInfo.Column("byline", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("bylineHtml", new TableInfo.Column("bylineHtml", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("charCount", new TableInfo.Column("charCount", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("firstPublicationDate", new TableInfo.Column("firstPublicationDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("headline", new TableInfo.Column("headline", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("isInappropriateForSponsorship", new TableInfo.Column("isInappropriateForSponsorship", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("isLive", new TableInfo.Column("isLive", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("isPremoderated", new TableInfo.Column("isPremoderated", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("lang", new TableInfo.Column("lang", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("lastModified", new TableInfo.Column("lastModified", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("legallySensitive", new TableInfo.Column("legallySensitive", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("main", new TableInfo.Column("main", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("newspaperEditionDate", new TableInfo.Column("newspaperEditionDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("newspaperPageNumber", new TableInfo.Column("newspaperPageNumber", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("productionOffice", new TableInfo.Column("productionOffice", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("publication", new TableInfo.Column("publication", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("shortUrl", new TableInfo.Column("shortUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("shouldHideAdverts", new TableInfo.Column("shouldHideAdverts", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("shouldHideReaderRevenue", new TableInfo.Column("shouldHideReaderRevenue", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("showAffiliateLinks", new TableInfo.Column("showAffiliateLinks", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("showInRelatedContent", new TableInfo.Column("showInRelatedContent", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("standfirst", new TableInfo.Column("standfirst", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("thumbnail", new TableInfo.Column("thumbnail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("trailText", new TableInfo.Column("trailText", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsItems.put("wordcount", new TableInfo.Column("wordcount", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNewsItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNewsItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNewsItems = new TableInfo("NewsItems", _columnsNewsItems, _foreignKeysNewsItems, _indicesNewsItems);
        final TableInfo _existingNewsItems = TableInfo.read(_db, "NewsItems");
        if (! _infoNewsItems.equals(_existingNewsItems)) {
          return new RoomOpenHelper.ValidationResult(false, "NewsItems(org.asghari.guardiannews.data.local.model.NewsItem).\n"
                  + " Expected:\n" + _infoNewsItems + "\n"
                  + " Found:\n" + _existingNewsItems);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "af9f7244bb3ed07b961c89d577bfc393", "d84fdec76cd4e8827c121d806047b86e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "NewsItems");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `NewsItems`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(NewsDao.class, NewsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public NewsDao newsDao() {
    if (_newsDao != null) {
      return _newsDao;
    } else {
      synchronized(this) {
        if(_newsDao == null) {
          _newsDao = new NewsDao_Impl(this);
        }
        return _newsDao;
      }
    }
  }
}
