package org.asghari.guardiannews;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.asghari.guardiannews.databinding.HomePageFragmentBindingImpl;
import org.asghari.guardiannews.databinding.NewsDetailesPageFragmentBindingImpl;
import org.asghari.guardiannews.databinding.NewsListItemBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_HOMEPAGEFRAGMENT = 1;

  private static final int LAYOUT_NEWSDETAILESPAGEFRAGMENT = 2;

  private static final int LAYOUT_NEWSLISTITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.asghari.guardiannews.R.layout.home_page_fragment, LAYOUT_HOMEPAGEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.asghari.guardiannews.R.layout.news_detailes_page_fragment, LAYOUT_NEWSDETAILESPAGEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.asghari.guardiannews.R.layout.news_list_item, LAYOUT_NEWSLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_HOMEPAGEFRAGMENT: {
          if ("layout/home_page_fragment_0".equals(tag)) {
            return new HomePageFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_page_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_NEWSDETAILESPAGEFRAGMENT: {
          if ("layout/news_detailes_page_fragment_0".equals(tag)) {
            return new NewsDetailesPageFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for news_detailes_page_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_NEWSLISTITEM: {
          if ("layout/news_list_item_0".equals(tag)) {
            return new NewsListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for news_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(1, "News");
      sKeys.put(0, "_all");
      sKeys.put(2, "data");
      sKeys.put(3, "value");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/home_page_fragment_0", org.asghari.guardiannews.R.layout.home_page_fragment);
      sKeys.put("layout/news_detailes_page_fragment_0", org.asghari.guardiannews.R.layout.news_detailes_page_fragment);
      sKeys.put("layout/news_list_item_0", org.asghari.guardiannews.R.layout.news_list_item);
    }
  }
}
