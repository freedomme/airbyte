/*
 * MIT License
 *
 * Copyright (c) 2020 Airbyte
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.airbyte.config.helpers;

import io.airbyte.config.Configs;
import java.io.File;
import java.nio.file.Path;

public class LogHelpers {

  // if you update these values, you must also update log4j2.xml
  public static String WORKSPACE_MDC_KEY = "workspace_app_root";
  public static String LOG_FILENAME = "logs.log";

  public static Path getServerLogsRoot(Configs configs) {
    return configs.getWorkspaceRoot().resolve("server/logs");
  }

  public static Path getSchedulerLogsRoot(Configs configs) {
    return configs.getWorkspaceRoot().resolve("scheduler/logs");
  }

  public static File getServerLogFile(Configs configs) {
    return getServerLogsRoot(configs).resolve(LOG_FILENAME).toFile();
  }

  public static File getSchedulerLogFile(Configs configs) {
    return getSchedulerLogsRoot(configs).resolve(LOG_FILENAME).toFile();
  }

}
