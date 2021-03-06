package sk.styk.martin.apkanalyzer.ui.activity.appdetail.actions

import android.os.Bundle
import sk.styk.martin.apkanalyzer.model.detail.AppDetailData
import sk.styk.martin.apkanalyzer.ui.activity.repackageddetection.RepackagedDetectionFragment
import sk.styk.martin.apkanalyzer.ui.base.BasePresenter

/**
 * @author Martin Styk
 * @version 28.01.2018.
 */
interface AppActionsContract {
    interface View {
        fun setUpViews()

        fun dismiss()

        fun dismissAllowingStateLoss()

        fun showOnlyApkFileRelatedActions()

        fun createSnackbar(text: String)

        fun openRepackagedDetection(fragment: RepackagedDetectionFragment)

        fun openManifestActivity(packageName: String)

        fun askForStoragePermission()

            fun startApkExport(appDetailData: AppDetailData)

        fun startSharingActivity(apkPath : String)

        fun openGooglePlay(packageName: String)

        fun openSystemAboutActivity(packageName: String)

        fun startApkInstall(apkPath: String)

    }

    interface Presenter : BasePresenter<View> {
        fun initialize(bundle: Bundle)

        fun copyClick()

        fun exportApkFile()

        fun shareClick()

        fun showGooglePlayClick()

        fun repackagedDetectionClick()

        fun showManifestClick()

        fun showSystemPageClick()

        fun installAppClick()
    }

    companion object {
        const val PACKAGE_TO_PERFORM_ACTIONS = "package_to_perform_actions"
        const val REQUEST_STORAGE_PERMISSION = 11
    }
}