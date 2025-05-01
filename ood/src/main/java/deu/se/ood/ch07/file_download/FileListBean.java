/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.ch07.file_download;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Haruki
 */
public class FileListBean {

    private String dirName;
    private List<String> relativeFileList = new ArrayList<String>();
    private List<String> absoluteFileList = new ArrayList<String>();

    public FileListBean() {
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
        readDirectory();
    }

    public List<String> getAbsoluteFileList() {
        return absoluteFileList;
    }

    public List<String> getRelativeFileList() {
        return relativeFileList;
    }

    /*
 * 디렉토리 dirName에 있는 파일 이름을 읽어들임.
     */
    private void readDirectory() {
        File dir = new File(dirName);

        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File f : files) {
                relativeFileList.add(f.getName());
                absoluteFileList.add(f.getAbsolutePath());
            }
        }
    }
}
