package gov.pnnl.aristotle.algorithms.mining.datamodel



/**
 * @author puro755
 *
 */
case class KGNodeV2Flat(label: String, 
    pattern_map: Map[List[Int], Long],properties:List[VertexProperty]) {

  def getInstanceCount = {
    getpattern_map.values.map(f => f)
  }

  def getVertextPropLableArray : List[Int] =
    {
      this.properties.map( vprop => vprop.property_label )
    }
  def getlabel : String = return label
  def getProperties: List[VertexProperty] = return properties
  def getpattern_map: Map[List[Int], Long] = return pattern_map

}
