// Generated by data binding compiler. Do not edit!
package org.asghari.guardiannews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.asghari.guardiannews.R;
import org.asghari.guardiannews.data.models.news.NewsList;

public abstract class NewsListItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView newsPublishDate;

  @NonNull
  public final ImageView newsThumb;

  @NonNull
  public final TextView newsTitle;

  @Bindable
  protected NewsList mNews;

  protected NewsListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView newsPublishDate, ImageView newsThumb, TextView newsTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.newsPublishDate = newsPublishDate;
    this.newsThumb = newsThumb;
    this.newsTitle = newsTitle;
  }

  public abstract void setNews(@Nullable NewsList News);

  @Nullable
  public NewsList getNews() {
    return mNews;
  }

  @NonNull
  public static NewsListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.news_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NewsListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NewsListItemBinding>inflateInternal(inflater, R.layout.news_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static NewsListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.news_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NewsListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NewsListItemBinding>inflateInternal(inflater, R.layout.news_list_item, null, false, component);
  }

  public static NewsListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static NewsListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (NewsListItemBinding)bind(component, view, R.layout.news_list_item);
  }
}