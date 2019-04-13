package ptfs;

public class PTFSLIB {
    public static native String  Init(String sRepoPath);
    public static native String  StartDaemon(String sRepoPath);
    public static native boolean IsDaemonOk(String sRepoPath);
    public static native String  StopDaemon(String sRepoPath);
    public static native String  RestartDaemon(String sRepoPath);
    public static native String  Upload(String sFilePath, String sRepoPath, boolean sIsDir);
    public static native String  Download(String sFileHash, String sFilePath, String sRepoPath);
    public static native int     GetDownloadSize(String sFileHash);
    public static native void    ClearDownloadInfo(String sFileHash);
    public static native String  CancelDownload(String sFileHash, String sRepoPath);
    public static native String  GetRepoSize(String sRepoPath);
    public static native String  ClearCache(String sRepoPath);

    static
    {
        System.loadLibrary("helper");
        System.loadLibrary("ptfs");
    }
}
