package com.taboola.android.sdksamples.tabs;

public interface TabsContract {

    interface TabsView {
        void setCurrentPage(int currentPage);

    }

    interface TabsPresenter extends BasePresenter<TabsContract.TabsView> {
        void setCurrentPage(int position);
    }

}
