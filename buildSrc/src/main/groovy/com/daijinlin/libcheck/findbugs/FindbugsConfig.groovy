package com.daijinlin.libcheck.findbugs

import com.daijinlin.libcheck.common.CommonConfig
import org.gradle.api.Project

/**
 * <pre>
 * Created by J!nl!n on 2018/3/15.
 * Copyright © 1990-2018 J!nl!n™ Inc. All rights reserved.
 *
 * </pre>
 */
class FindbugsConfig extends CommonConfig {
  boolean ignoreFailures = true
  String toolVersion = "3.0.1"
  String effort = "max"
  String reportLevel = "high"

  FindbugsConfig(Project project) { super(project) }
}