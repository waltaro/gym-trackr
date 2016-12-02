package com.walterngo.gymtrackr.application.presentation.presenters

class MainPresenter() {

    private var mView: ViewSurface? = null

    fun onCreateView(viewSurface: ViewSurface) {
        mView = viewSurface
    }

    interface ViewSurface {

    }

}