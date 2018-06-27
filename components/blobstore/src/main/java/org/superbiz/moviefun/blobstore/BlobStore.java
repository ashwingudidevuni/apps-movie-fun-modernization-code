package org.superbiz.moviefun.blobstore;

import java.io.IOException;
import java.util.Optional;

public interface BlobStore {

    void put(org.superbiz.moviefun.blobstore.Blob blob) throws IOException;

    Optional<Blob> get(String name) throws IOException;
}
