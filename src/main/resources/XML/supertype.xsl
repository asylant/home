<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
  <head></head>
<body>
  <h2>Supertype Person</h2>
  <table>
    <tr>
	 <!-- <th>ID</th> -->
      <th>Name</th>
      <th>Phone</th>
    </tr>
    <xsl:for-each select="/DATA/ROW">
    <tr>
	  <!-- <td class="zero"><xsl:value-of select="id_person"/></td> -->
      <td><xsl:value-of select="name"/></td>
      <td><xsl:value-of select="phone"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>