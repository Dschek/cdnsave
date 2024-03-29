package com.example.cdnsave.model.FileSystemResponse;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class FileSystemResponse {
    private List<DirectoryStatisticResponse> directoryList;
}
