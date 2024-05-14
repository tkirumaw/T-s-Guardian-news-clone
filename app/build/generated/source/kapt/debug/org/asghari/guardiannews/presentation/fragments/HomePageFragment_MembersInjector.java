// Generated by Dagger (https://dagger.dev).
package org.asghari.guardiannews.presentation.fragments;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.asghari.guardiannews.presentation.adapters.NewsListAdapter;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomePageFragment_MembersInjector implements MembersInjector<HomePageFragment> {
  private final Provider<NewsListAdapter> newsListAdapterProvider;

  public HomePageFragment_MembersInjector(Provider<NewsListAdapter> newsListAdapterProvider) {
    this.newsListAdapterProvider = newsListAdapterProvider;
  }

  public static MembersInjector<HomePageFragment> create(
      Provider<NewsListAdapter> newsListAdapterProvider) {
    return new HomePageFragment_MembersInjector(newsListAdapterProvider);
  }

  @Override
  public void injectMembers(HomePageFragment instance) {
    injectNewsListAdapter(instance, newsListAdapterProvider.get());
  }

  @InjectedFieldSignature("org.asghari.guardiannews.presentation.fragments.HomePageFragment.newsListAdapter")
  public static void injectNewsListAdapter(HomePageFragment instance,
      NewsListAdapter newsListAdapter) {
    instance.newsListAdapter = newsListAdapter;
  }
}