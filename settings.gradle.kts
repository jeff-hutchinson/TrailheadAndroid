rootProject.name = "MyTrailNative"

include(":app")

val salesforceMobileSdkRoot = File("mobile_sdk/SalesforceMobileSDK-Android")
if (salesforceMobileSdkRoot.exists()) {
    includeBuild(salesforceMobileSdkRoot)
}