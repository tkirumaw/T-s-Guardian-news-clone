// Generated by Dagger (https://dagger.dev).
package org.asghari.guardiannews.presentation.adapters;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsListAdapter_Factory implements Factory<NewsListAdapter> {
  @Override
  public NewsListAdapter get() {
    return newInstance();
  }

  public static NewsListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NewsListAdapter newInstance() {
    return new NewsListAdapter();
  }

  private static final class InstanceHolder {
    private static final NewsListAdapter_Factory INSTANCE = new NewsListAdapter_Factory();
  }
}
