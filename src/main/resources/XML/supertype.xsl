<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
  <body>
  <h1>WP 5: Supertype Person</h1>
    <br></br>
    <table>
      <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Phone</th>
    </tr>
    <xsl:for-each select="/DATA/ROW">
    <tr>
      <td><xsl:value-of select="id_person"/></td>
      <td><xsl:value-of select="name"/></td>
      <td><xsl:value-of select="phone"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>