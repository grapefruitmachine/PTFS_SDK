package com.example.ptfs;

import com.google.gson.Gson;

import ptfs.PTFSLIB;

public class PTFSAPI {
    private static Response Str2Res(String resStr) {
        Gson gson = new Gson();
        Response response = gson.fromJson(resStr, Response.class);

        return response;
    }

    public static Response PTFSInit(String repoPath) {
        String resStr = PTFSLIB.Init(repoPath);

        return Str2Res(resStr);
    }

    public static Response PTFSInitBootstrap(String bootStrap, String repoPath) {
        String resStr = PTFSLIB.InitBootStrap(bootStrap, repoPath);

        return Str2Res(resStr);
    }

    public static Response PTFSStartDaemon(String repoPath) {
        String resStr = PTFSLIB.StartDaemon(repoPath);

        return Str2Res(resStr);
    }

    public static boolean PTFSIsDaemonOk(String repoPath) {
        return PTFSLIB.IsDaemonOk(repoPath);
    }

    public static Response PTFSStopDaemon(String repoPath) {
        String resStr = PTFSLIB.StopDaemon(repoPath);

        return Str2Res(resStr);
    }

    public static Response PTFSRestartDaemon(String repoPath) {
        String resStr = PTFSLIB.RestartDaemon(repoPath);

        return Str2Res(resStr);
    }

    public static Response PTFSGetPathSize(String filePath, boolean isDir) {
        String resStr = PTFSLIB.GetPathSize(filePath, isDir);

        return Str2Res(resStr);
    }

    public static Response PTFSUpload(String filePath, String repoPath, int size, boolean isDir) {
        String resStr = PTFSLIB.Upload(filePath, repoPath, size, isDir);

        return Str2Res(resStr);
    }

    public static void PTFSCancelUpload(int taskId) {
        PTFSLIB.CancelUpload(taskId);
    }

    public static Response PTFSGetUploadSize(int taskId) {
        String resStr = PTFSLIB.GetUploadSize(taskId);

        return Str2Res(resStr);
    }

    public static void PTFSClearUploadInfo(int taskId) {
        PTFSLIB.ClearUploadInfo(taskId);
    }

    public static Response PTFSDownload(String fileHash, String filePath, String repoPath) {
        String resStr = PTFSLIB.Download(fileHash, filePath, repoPath);

        return Str2Res(resStr);
    }

    public static int PTFSGetDownloadSize(int taskId) {
        int size = PTFSLIB.GetDownloadSize(taskId);

        return size;
    }

    public static void PTFSClearDownloadInfo(int taskId) {
        PTFSLIB.ClearDownloadInfo(taskId);
    }

    public static Response PTFSCancelDownload(String fileHash, String repoPath) {
        String resStr = PTFSLIB.CancelDownload(fileHash, repoPath);

        return Str2Res(resStr);
    }

    public static Response PTFSGetRepoSize(String repoPath) {
        String resStr = PTFSLIB.GetRepoSize(repoPath);

        return Str2Res(resStr);
    }

    public static Response PTFSClearCache(String repoPath) {
        String resStr = PTFSLIB.ClearCache(repoPath);

        return Str2Res(resStr);
    }

    public static Response PTFSGetBandWidth(String repoPath) {
        String resStr = PTFSLIB.GetBandWidth(repoPath);

        return Str2Res(resStr);
    }

}
