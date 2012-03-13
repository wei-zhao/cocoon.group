<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 <xsl:template match="/">
 <html>
 <head>
 <title>Output of the XSLT transformation service.</title>
 </head>
 <body>
 Output of the XSLT transformation service.
 <xsl:copy-of select="content/*"/>
 </body>
 </html>
 </xsl:template>
</xsl:stylesheet>