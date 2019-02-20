require gnutls.inc

PR .= ".1"

SRC_URI += "file://0001-configure.ac-fix-sed-command.patch \
            file://use-pkg-config-to-locate-zlib.patch \
            file://arm_eabi.patch \
            file://CVE-2018-10844_45_46_p1.patch \
            file://CVE-2018-10844_45_46_p2.patch \
            file://CVE-2018-10844_45_46_p3.patch \
            file://CVE-2018-10844_45_46_p4.patch \
            file://CVE-2018-10844_45_46_p5.patch \
           "
SRC_URI[md5sum] = "4fd41ad86572933c2379b4cc321a0959"
SRC_URI[sha256sum] = "79f5480ad198dad5bc78e075f4a40c4a315a1b2072666919d2d05a08aec13096"

BBCLASSEXTEND = "native nativesdk"
