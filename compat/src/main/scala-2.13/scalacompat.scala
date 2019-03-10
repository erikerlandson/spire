package spire.scalacompat

trait ScalaOrderingWrapperCompat[A] extends scala.math.Ordering[A] {
  override def min[U <: A](x:U, y:U): U = if (lt(x, y)) x else y
  override def max[U <: A](x:U, y:U): U = if (gt(x, y)) x else y
}

trait BuilderCompat[-A, +To] extends scala.collection.mutable.Builder[A, To]

trait IterableLikeCompat[A, Repr] extends spire.scalacompat.IterableLike[A, Repr] {
  def newBuilder: scala.collection.mutable.Builder[A, Repr]
}
