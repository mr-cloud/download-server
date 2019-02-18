package com.nurkiewicz.download;

import java.util.Optional;
import java.util.UUID;

public interface FileStorage {
    /**
     * Optional is used with streamingful functions
     * @param uuid
     * @return
     */
	Optional<FilePointer> findFile(UUID uuid);
}
