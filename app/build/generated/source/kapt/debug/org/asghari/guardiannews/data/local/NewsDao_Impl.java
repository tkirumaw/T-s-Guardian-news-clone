package org.asghari.guardiannews.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.asghari.guardiannews.data.local.model.Fields;
import org.asghari.guardiannews.data.local.model.NewsItem;
import org.asghari.guardiannews.data.local.model.Tag;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl extends NewsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsItem> __insertionAdapterOfNewsItem;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<NewsItem> __deletionAdapterOfNewsItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteNewsItemByQuery;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsItem = new EntityInsertionAdapter<NewsItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `NewsItems` (`apiUrl`,`id`,`isHosted`,`pillarId`,`pillarName`,`sectionId`,`sectionName`,`tags`,`type`,`webPublicationDate`,`webTitle`,`webUrl`,`body`,`bodyText`,`byline`,`bylineHtml`,`charCount`,`firstPublicationDate`,`headline`,`isInappropriateForSponsorship`,`isLive`,`isPremoderated`,`lang`,`lastModified`,`legallySensitive`,`main`,`newspaperEditionDate`,`newspaperPageNumber`,`productionOffice`,`publication`,`shortUrl`,`shouldHideAdverts`,`shouldHideReaderRevenue`,`showAffiliateLinks`,`showInRelatedContent`,`standfirst`,`thumbnail`,`trailText`,`wordcount`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsItem value) {
        if (value.getApiUrl() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getApiUrl());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        final int _tmp = value.isHosted() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getPillarId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPillarId());
        }
        if (value.getPillarName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPillarName());
        }
        if (value.getSectionId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSectionId());
        }
        if (value.getSectionName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSectionName());
        }
        final String _tmp_1 = __converters.ToJson(value.getTags());
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_1);
        }
        if (value.getType() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getType());
        }
        if (value.getWebPublicationDate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getWebPublicationDate());
        }
        if (value.getWebTitle() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getWebTitle());
        }
        if (value.getWebUrl() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getWebUrl());
        }
        final Fields _tmpFields = value.getFields();
        if(_tmpFields != null) {
          if (_tmpFields.getBody() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpFields.getBody());
          }
          if (_tmpFields.getBodyText() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpFields.getBodyText());
          }
          if (_tmpFields.getByline() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpFields.getByline());
          }
          if (_tmpFields.getBylineHtml() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpFields.getBylineHtml());
          }
          if (_tmpFields.getCharCount() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindString(17, _tmpFields.getCharCount());
          }
          if (_tmpFields.getFirstPublicationDate() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindString(18, _tmpFields.getFirstPublicationDate());
          }
          if (_tmpFields.getHeadline() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindString(19, _tmpFields.getHeadline());
          }
          if (_tmpFields.isInappropriateForSponsorship() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpFields.isInappropriateForSponsorship());
          }
          if (_tmpFields.isLive() == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindString(21, _tmpFields.isLive());
          }
          if (_tmpFields.isPremoderated() == null) {
            stmt.bindNull(22);
          } else {
            stmt.bindString(22, _tmpFields.isPremoderated());
          }
          if (_tmpFields.getLang() == null) {
            stmt.bindNull(23);
          } else {
            stmt.bindString(23, _tmpFields.getLang());
          }
          if (_tmpFields.getLastModified() == null) {
            stmt.bindNull(24);
          } else {
            stmt.bindString(24, _tmpFields.getLastModified());
          }
          if (_tmpFields.getLegallySensitive() == null) {
            stmt.bindNull(25);
          } else {
            stmt.bindString(25, _tmpFields.getLegallySensitive());
          }
          if (_tmpFields.getMain() == null) {
            stmt.bindNull(26);
          } else {
            stmt.bindString(26, _tmpFields.getMain());
          }
          if (_tmpFields.getNewspaperEditionDate() == null) {
            stmt.bindNull(27);
          } else {
            stmt.bindString(27, _tmpFields.getNewspaperEditionDate());
          }
          if (_tmpFields.getNewspaperPageNumber() == null) {
            stmt.bindNull(28);
          } else {
            stmt.bindString(28, _tmpFields.getNewspaperPageNumber());
          }
          if (_tmpFields.getProductionOffice() == null) {
            stmt.bindNull(29);
          } else {
            stmt.bindString(29, _tmpFields.getProductionOffice());
          }
          if (_tmpFields.getPublication() == null) {
            stmt.bindNull(30);
          } else {
            stmt.bindString(30, _tmpFields.getPublication());
          }
          if (_tmpFields.getShortUrl() == null) {
            stmt.bindNull(31);
          } else {
            stmt.bindString(31, _tmpFields.getShortUrl());
          }
          if (_tmpFields.getShouldHideAdverts() == null) {
            stmt.bindNull(32);
          } else {
            stmt.bindString(32, _tmpFields.getShouldHideAdverts());
          }
          if (_tmpFields.getShouldHideReaderRevenue() == null) {
            stmt.bindNull(33);
          } else {
            stmt.bindString(33, _tmpFields.getShouldHideReaderRevenue());
          }
          if (_tmpFields.getShowAffiliateLinks() == null) {
            stmt.bindNull(34);
          } else {
            stmt.bindString(34, _tmpFields.getShowAffiliateLinks());
          }
          if (_tmpFields.getShowInRelatedContent() == null) {
            stmt.bindNull(35);
          } else {
            stmt.bindString(35, _tmpFields.getShowInRelatedContent());
          }
          if (_tmpFields.getStandfirst() == null) {
            stmt.bindNull(36);
          } else {
            stmt.bindString(36, _tmpFields.getStandfirst());
          }
          if (_tmpFields.getThumbnail() == null) {
            stmt.bindNull(37);
          } else {
            stmt.bindString(37, _tmpFields.getThumbnail());
          }
          if (_tmpFields.getTrailText() == null) {
            stmt.bindNull(38);
          } else {
            stmt.bindString(38, _tmpFields.getTrailText());
          }
          if (_tmpFields.getWordcount() == null) {
            stmt.bindNull(39);
          } else {
            stmt.bindString(39, _tmpFields.getWordcount());
          }
        } else {
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
          stmt.bindNull(21);
          stmt.bindNull(22);
          stmt.bindNull(23);
          stmt.bindNull(24);
          stmt.bindNull(25);
          stmt.bindNull(26);
          stmt.bindNull(27);
          stmt.bindNull(28);
          stmt.bindNull(29);
          stmt.bindNull(30);
          stmt.bindNull(31);
          stmt.bindNull(32);
          stmt.bindNull(33);
          stmt.bindNull(34);
          stmt.bindNull(35);
          stmt.bindNull(36);
          stmt.bindNull(37);
          stmt.bindNull(38);
          stmt.bindNull(39);
        }
      }
    };
    this.__deletionAdapterOfNewsItem = new EntityDeletionOrUpdateAdapter<NewsItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `NewsItems` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteNewsItemByQuery = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM NewsItems WHERE bodyText LIKE '%'||(?)||'%' OR webTitle LIKE '%'||(?)||'%' ";
        return _query;
      }
    };
  }

  @Override
  public Object InsertNewsItem(final NewsItem newsItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsItem.insert(newsItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object InsertAll(final List<NewsItem> newsItems,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsItem.insert(newsItems);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object DeleteNewsItem(final NewsItem newsItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfNewsItem.handle(newsItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object DeleteNewsItemByQuery(final String query,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteNewsItemByQuery.acquire();
        int _argIndex = 1;
        if (query == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, query);
        }
        _argIndex = 2;
        if (query == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, query);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteNewsItemByQuery.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object GetNewsItemsByQuery(final String query, final int page, final int itemCount,
      final Continuation<? super List<NewsItem>> continuation) {
    final String _sql = "SELECT * FROM NewsItems WHERE bodyText LIKE '%'||(?)||'%' OR webTitle LIKE '%'||(?)||'%'  LIMIT ? , ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, page);
    _argIndex = 4;
    _statement.bindLong(_argIndex, itemCount);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<NewsItem>>() {
      @Override
      public List<NewsItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfApiUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "apiUrl");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIsHosted = CursorUtil.getColumnIndexOrThrow(_cursor, "isHosted");
          final int _cursorIndexOfPillarId = CursorUtil.getColumnIndexOrThrow(_cursor, "pillarId");
          final int _cursorIndexOfPillarName = CursorUtil.getColumnIndexOrThrow(_cursor, "pillarName");
          final int _cursorIndexOfSectionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sectionId");
          final int _cursorIndexOfSectionName = CursorUtil.getColumnIndexOrThrow(_cursor, "sectionName");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfWebPublicationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "webPublicationDate");
          final int _cursorIndexOfWebTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "webTitle");
          final int _cursorIndexOfWebUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "webUrl");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfBodyText = CursorUtil.getColumnIndexOrThrow(_cursor, "bodyText");
          final int _cursorIndexOfByline = CursorUtil.getColumnIndexOrThrow(_cursor, "byline");
          final int _cursorIndexOfBylineHtml = CursorUtil.getColumnIndexOrThrow(_cursor, "bylineHtml");
          final int _cursorIndexOfCharCount = CursorUtil.getColumnIndexOrThrow(_cursor, "charCount");
          final int _cursorIndexOfFirstPublicationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstPublicationDate");
          final int _cursorIndexOfHeadline = CursorUtil.getColumnIndexOrThrow(_cursor, "headline");
          final int _cursorIndexOfIsInappropriateForSponsorship = CursorUtil.getColumnIndexOrThrow(_cursor, "isInappropriateForSponsorship");
          final int _cursorIndexOfIsLive = CursorUtil.getColumnIndexOrThrow(_cursor, "isLive");
          final int _cursorIndexOfIsPremoderated = CursorUtil.getColumnIndexOrThrow(_cursor, "isPremoderated");
          final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
          final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "lastModified");
          final int _cursorIndexOfLegallySensitive = CursorUtil.getColumnIndexOrThrow(_cursor, "legallySensitive");
          final int _cursorIndexOfMain = CursorUtil.getColumnIndexOrThrow(_cursor, "main");
          final int _cursorIndexOfNewspaperEditionDate = CursorUtil.getColumnIndexOrThrow(_cursor, "newspaperEditionDate");
          final int _cursorIndexOfNewspaperPageNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "newspaperPageNumber");
          final int _cursorIndexOfProductionOffice = CursorUtil.getColumnIndexOrThrow(_cursor, "productionOffice");
          final int _cursorIndexOfPublication = CursorUtil.getColumnIndexOrThrow(_cursor, "publication");
          final int _cursorIndexOfShortUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "shortUrl");
          final int _cursorIndexOfShouldHideAdverts = CursorUtil.getColumnIndexOrThrow(_cursor, "shouldHideAdverts");
          final int _cursorIndexOfShouldHideReaderRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "shouldHideReaderRevenue");
          final int _cursorIndexOfShowAffiliateLinks = CursorUtil.getColumnIndexOrThrow(_cursor, "showAffiliateLinks");
          final int _cursorIndexOfShowInRelatedContent = CursorUtil.getColumnIndexOrThrow(_cursor, "showInRelatedContent");
          final int _cursorIndexOfStandfirst = CursorUtil.getColumnIndexOrThrow(_cursor, "standfirst");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final int _cursorIndexOfTrailText = CursorUtil.getColumnIndexOrThrow(_cursor, "trailText");
          final int _cursorIndexOfWordcount = CursorUtil.getColumnIndexOrThrow(_cursor, "wordcount");
          final List<NewsItem> _result = new ArrayList<NewsItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NewsItem _item;
            final String _tmpApiUrl;
            if (_cursor.isNull(_cursorIndexOfApiUrl)) {
              _tmpApiUrl = null;
            } else {
              _tmpApiUrl = _cursor.getString(_cursorIndexOfApiUrl);
            }
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final boolean _tmpIsHosted;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsHosted);
            _tmpIsHosted = _tmp != 0;
            final String _tmpPillarId;
            if (_cursor.isNull(_cursorIndexOfPillarId)) {
              _tmpPillarId = null;
            } else {
              _tmpPillarId = _cursor.getString(_cursorIndexOfPillarId);
            }
            final String _tmpPillarName;
            if (_cursor.isNull(_cursorIndexOfPillarName)) {
              _tmpPillarName = null;
            } else {
              _tmpPillarName = _cursor.getString(_cursorIndexOfPillarName);
            }
            final String _tmpSectionId;
            if (_cursor.isNull(_cursorIndexOfSectionId)) {
              _tmpSectionId = null;
            } else {
              _tmpSectionId = _cursor.getString(_cursorIndexOfSectionId);
            }
            final String _tmpSectionName;
            if (_cursor.isNull(_cursorIndexOfSectionName)) {
              _tmpSectionName = null;
            } else {
              _tmpSectionName = _cursor.getString(_cursorIndexOfSectionName);
            }
            final List<Tag> _tmpTags;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfTags);
            }
            _tmpTags = __converters.ToList(_tmp_1);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpWebPublicationDate;
            if (_cursor.isNull(_cursorIndexOfWebPublicationDate)) {
              _tmpWebPublicationDate = null;
            } else {
              _tmpWebPublicationDate = _cursor.getString(_cursorIndexOfWebPublicationDate);
            }
            final String _tmpWebTitle;
            if (_cursor.isNull(_cursorIndexOfWebTitle)) {
              _tmpWebTitle = null;
            } else {
              _tmpWebTitle = _cursor.getString(_cursorIndexOfWebTitle);
            }
            final String _tmpWebUrl;
            if (_cursor.isNull(_cursorIndexOfWebUrl)) {
              _tmpWebUrl = null;
            } else {
              _tmpWebUrl = _cursor.getString(_cursorIndexOfWebUrl);
            }
            final Fields _tmpFields;
            if (! (_cursor.isNull(_cursorIndexOfBody) && _cursor.isNull(_cursorIndexOfBodyText) && _cursor.isNull(_cursorIndexOfByline) && _cursor.isNull(_cursorIndexOfBylineHtml) && _cursor.isNull(_cursorIndexOfCharCount) && _cursor.isNull(_cursorIndexOfFirstPublicationDate) && _cursor.isNull(_cursorIndexOfHeadline) && _cursor.isNull(_cursorIndexOfIsInappropriateForSponsorship) && _cursor.isNull(_cursorIndexOfIsLive) && _cursor.isNull(_cursorIndexOfIsPremoderated) && _cursor.isNull(_cursorIndexOfLang) && _cursor.isNull(_cursorIndexOfLastModified) && _cursor.isNull(_cursorIndexOfLegallySensitive) && _cursor.isNull(_cursorIndexOfMain) && _cursor.isNull(_cursorIndexOfNewspaperEditionDate) && _cursor.isNull(_cursorIndexOfNewspaperPageNumber) && _cursor.isNull(_cursorIndexOfProductionOffice) && _cursor.isNull(_cursorIndexOfPublication) && _cursor.isNull(_cursorIndexOfShortUrl) && _cursor.isNull(_cursorIndexOfShouldHideAdverts) && _cursor.isNull(_cursorIndexOfShouldHideReaderRevenue) && _cursor.isNull(_cursorIndexOfShowAffiliateLinks) && _cursor.isNull(_cursorIndexOfShowInRelatedContent) && _cursor.isNull(_cursorIndexOfStandfirst) && _cursor.isNull(_cursorIndexOfThumbnail) && _cursor.isNull(_cursorIndexOfTrailText) && _cursor.isNull(_cursorIndexOfWordcount))) {
              final String _tmpBody;
              if (_cursor.isNull(_cursorIndexOfBody)) {
                _tmpBody = null;
              } else {
                _tmpBody = _cursor.getString(_cursorIndexOfBody);
              }
              final String _tmpBodyText;
              if (_cursor.isNull(_cursorIndexOfBodyText)) {
                _tmpBodyText = null;
              } else {
                _tmpBodyText = _cursor.getString(_cursorIndexOfBodyText);
              }
              final String _tmpByline;
              if (_cursor.isNull(_cursorIndexOfByline)) {
                _tmpByline = null;
              } else {
                _tmpByline = _cursor.getString(_cursorIndexOfByline);
              }
              final String _tmpBylineHtml;
              if (_cursor.isNull(_cursorIndexOfBylineHtml)) {
                _tmpBylineHtml = null;
              } else {
                _tmpBylineHtml = _cursor.getString(_cursorIndexOfBylineHtml);
              }
              final String _tmpCharCount;
              if (_cursor.isNull(_cursorIndexOfCharCount)) {
                _tmpCharCount = null;
              } else {
                _tmpCharCount = _cursor.getString(_cursorIndexOfCharCount);
              }
              final String _tmpFirstPublicationDate;
              if (_cursor.isNull(_cursorIndexOfFirstPublicationDate)) {
                _tmpFirstPublicationDate = null;
              } else {
                _tmpFirstPublicationDate = _cursor.getString(_cursorIndexOfFirstPublicationDate);
              }
              final String _tmpHeadline;
              if (_cursor.isNull(_cursorIndexOfHeadline)) {
                _tmpHeadline = null;
              } else {
                _tmpHeadline = _cursor.getString(_cursorIndexOfHeadline);
              }
              final String _tmpIsInappropriateForSponsorship;
              if (_cursor.isNull(_cursorIndexOfIsInappropriateForSponsorship)) {
                _tmpIsInappropriateForSponsorship = null;
              } else {
                _tmpIsInappropriateForSponsorship = _cursor.getString(_cursorIndexOfIsInappropriateForSponsorship);
              }
              final String _tmpIsLive;
              if (_cursor.isNull(_cursorIndexOfIsLive)) {
                _tmpIsLive = null;
              } else {
                _tmpIsLive = _cursor.getString(_cursorIndexOfIsLive);
              }
              final String _tmpIsPremoderated;
              if (_cursor.isNull(_cursorIndexOfIsPremoderated)) {
                _tmpIsPremoderated = null;
              } else {
                _tmpIsPremoderated = _cursor.getString(_cursorIndexOfIsPremoderated);
              }
              final String _tmpLang;
              if (_cursor.isNull(_cursorIndexOfLang)) {
                _tmpLang = null;
              } else {
                _tmpLang = _cursor.getString(_cursorIndexOfLang);
              }
              final String _tmpLastModified;
              if (_cursor.isNull(_cursorIndexOfLastModified)) {
                _tmpLastModified = null;
              } else {
                _tmpLastModified = _cursor.getString(_cursorIndexOfLastModified);
              }
              final String _tmpLegallySensitive;
              if (_cursor.isNull(_cursorIndexOfLegallySensitive)) {
                _tmpLegallySensitive = null;
              } else {
                _tmpLegallySensitive = _cursor.getString(_cursorIndexOfLegallySensitive);
              }
              final String _tmpMain;
              if (_cursor.isNull(_cursorIndexOfMain)) {
                _tmpMain = null;
              } else {
                _tmpMain = _cursor.getString(_cursorIndexOfMain);
              }
              final String _tmpNewspaperEditionDate;
              if (_cursor.isNull(_cursorIndexOfNewspaperEditionDate)) {
                _tmpNewspaperEditionDate = null;
              } else {
                _tmpNewspaperEditionDate = _cursor.getString(_cursorIndexOfNewspaperEditionDate);
              }
              final String _tmpNewspaperPageNumber;
              if (_cursor.isNull(_cursorIndexOfNewspaperPageNumber)) {
                _tmpNewspaperPageNumber = null;
              } else {
                _tmpNewspaperPageNumber = _cursor.getString(_cursorIndexOfNewspaperPageNumber);
              }
              final String _tmpProductionOffice;
              if (_cursor.isNull(_cursorIndexOfProductionOffice)) {
                _tmpProductionOffice = null;
              } else {
                _tmpProductionOffice = _cursor.getString(_cursorIndexOfProductionOffice);
              }
              final String _tmpPublication;
              if (_cursor.isNull(_cursorIndexOfPublication)) {
                _tmpPublication = null;
              } else {
                _tmpPublication = _cursor.getString(_cursorIndexOfPublication);
              }
              final String _tmpShortUrl;
              if (_cursor.isNull(_cursorIndexOfShortUrl)) {
                _tmpShortUrl = null;
              } else {
                _tmpShortUrl = _cursor.getString(_cursorIndexOfShortUrl);
              }
              final String _tmpShouldHideAdverts;
              if (_cursor.isNull(_cursorIndexOfShouldHideAdverts)) {
                _tmpShouldHideAdverts = null;
              } else {
                _tmpShouldHideAdverts = _cursor.getString(_cursorIndexOfShouldHideAdverts);
              }
              final String _tmpShouldHideReaderRevenue;
              if (_cursor.isNull(_cursorIndexOfShouldHideReaderRevenue)) {
                _tmpShouldHideReaderRevenue = null;
              } else {
                _tmpShouldHideReaderRevenue = _cursor.getString(_cursorIndexOfShouldHideReaderRevenue);
              }
              final String _tmpShowAffiliateLinks;
              if (_cursor.isNull(_cursorIndexOfShowAffiliateLinks)) {
                _tmpShowAffiliateLinks = null;
              } else {
                _tmpShowAffiliateLinks = _cursor.getString(_cursorIndexOfShowAffiliateLinks);
              }
              final String _tmpShowInRelatedContent;
              if (_cursor.isNull(_cursorIndexOfShowInRelatedContent)) {
                _tmpShowInRelatedContent = null;
              } else {
                _tmpShowInRelatedContent = _cursor.getString(_cursorIndexOfShowInRelatedContent);
              }
              final String _tmpStandfirst;
              if (_cursor.isNull(_cursorIndexOfStandfirst)) {
                _tmpStandfirst = null;
              } else {
                _tmpStandfirst = _cursor.getString(_cursorIndexOfStandfirst);
              }
              final String _tmpThumbnail;
              if (_cursor.isNull(_cursorIndexOfThumbnail)) {
                _tmpThumbnail = null;
              } else {
                _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
              }
              final String _tmpTrailText;
              if (_cursor.isNull(_cursorIndexOfTrailText)) {
                _tmpTrailText = null;
              } else {
                _tmpTrailText = _cursor.getString(_cursorIndexOfTrailText);
              }
              final String _tmpWordcount;
              if (_cursor.isNull(_cursorIndexOfWordcount)) {
                _tmpWordcount = null;
              } else {
                _tmpWordcount = _cursor.getString(_cursorIndexOfWordcount);
              }
              _tmpFields = new Fields(_tmpBody,_tmpBodyText,_tmpByline,_tmpBylineHtml,_tmpCharCount,_tmpFirstPublicationDate,_tmpHeadline,_tmpIsInappropriateForSponsorship,_tmpIsLive,_tmpIsPremoderated,_tmpLang,_tmpLastModified,_tmpLegallySensitive,_tmpMain,_tmpNewspaperEditionDate,_tmpNewspaperPageNumber,_tmpProductionOffice,_tmpPublication,_tmpShortUrl,_tmpShouldHideAdverts,_tmpShouldHideReaderRevenue,_tmpShowAffiliateLinks,_tmpShowInRelatedContent,_tmpStandfirst,_tmpThumbnail,_tmpTrailText,_tmpWordcount);
            }  else  {
              _tmpFields = null;
            }
            _item = new NewsItem(_tmpApiUrl,_tmpFields,_tmpId,_tmpIsHosted,_tmpPillarId,_tmpPillarName,_tmpSectionId,_tmpSectionName,_tmpTags,_tmpType,_tmpWebPublicationDate,_tmpWebTitle,_tmpWebUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
