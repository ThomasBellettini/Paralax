package fr.paralax.server.storage;

import java.util.UUID;

public class StorageClass {

    private final String _fileID;

    public StorageClass() {
        _fileID = UUID.randomUUID().toString();
    }

    public String getFileID() {
        return _fileID;
    }
}
