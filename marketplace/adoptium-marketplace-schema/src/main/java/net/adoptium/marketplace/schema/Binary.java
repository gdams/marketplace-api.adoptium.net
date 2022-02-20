package net.adoptium.marketplace.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.Date;

@Schema
public class Binary {

    private final OperatingSystem os;

    private final Architecture architecture;

    private final ImageType image_type;

    private final CLib c_lib;

    private final JvmImpl jvm_impl;

    @Schema(implementation = Package.class, name = "package")
    @JsonProperty("package")
    private final Package _package;

    @Schema(implementation = Installer.class)
    private final Installer installer;

    private final Date timestamp;

    @Schema(example = "dd28d6d2cde2b931caf94ac2422a2ad082ea62f0beee3bf7057317c53093de93")
    private final String scm_ref;

    private final Project project;

    private final Distribution distribution;

    @JsonCreator
    public Binary(
        @JsonProperty("os") OperatingSystem os,
        @JsonProperty("architecture") Architecture architecture,
        @JsonProperty("image_type") ImageType image_type,
        @JsonProperty("c_lib") CLib c_lib,
        @JsonProperty("jvm_impl") JvmImpl jvm_impl,
        @JsonProperty("package") Package aPackage,
        @JsonProperty("installer") Installer installer,
        @JsonProperty("timestamp") Date timestamp,
        @JsonProperty("scm_ref") String scm_ref,
        @JsonProperty("project") Project project,
        @JsonProperty("distribution") Distribution distribution) {
        this.os = os;
        this.architecture = architecture;
        this.image_type = image_type;
        this.c_lib = c_lib;
        this.jvm_impl = jvm_impl;
        _package = aPackage;
        this.installer = installer;
        this.timestamp = timestamp;
        this.scm_ref = scm_ref;
        this.project = project;
        this.distribution = distribution;
    }

    public OperatingSystem getOs() {
        return os;
    }

    public Architecture getArchitecture() {
        return architecture;
    }

    public ImageType getImage_type() {
        return image_type;
    }

    public CLib getC_lib() {
        return c_lib;
    }

    public JvmImpl getJvm_impl() {
        return jvm_impl;
    }

    @JsonProperty("package")
    public Package getPackage() {
        return _package;
    }

    public Installer getInstaller() {
        return installer;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    public Date getTimestamp() {
        return timestamp;
    }

    public String getScm_ref() {
        return scm_ref;
    }

    public Project getProject() {
        return project;
    }

    public Distribution getDistribution() {
        return distribution;
    }
}
