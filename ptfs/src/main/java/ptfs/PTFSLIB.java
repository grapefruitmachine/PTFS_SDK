package ptfs;

public class PTFSLIB {
    public static native String  Init(String sRepoPath);
    public static native String InitBootStrap(String sBootStraps, String sRepoPath);
    public static native String  StartDaemon(String sRepoPath);
    public static native boolean IsDaemonOk(String sRepoPath);
    public static native String  StopDaemon(String sRepoPath);
    public static native String  RestartDaemon(String sRepoPath);
    public static native String GetPathSize(String sFilePath, boolean sIsDir);
    public static native String  Upload(String sFilePath, String sRepoPath, int sSize, boolean sIsDir);
    public static native void CancelUpload(int sTaskId);
    public static native String GetUploadSize(int sTaskId);
    public static native void ClearUploadInfo(int sTaskId);
    public static native String  Download(String sFileHash, String sFilePath, String sRepoPath);
    public static native int     GetDownloadSize(int sTaskId);
    public static native void    ClearDownloadInfo(int sTaskId);
    public static native String  CancelDownload(String sFileHash, String sRepoPath);
    public static native String  GetRepoSize(String sRepoPath);
    public static native String  ClearCache(String sRepoPath);
    public static native String GetBandWidth(String sRepoPath);

    static
    {
        System.loadLibrary("helper");
        System.loadLibrary("ptfs");
    }
}
