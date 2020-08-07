// !LANGUAGE: +CompileTimeCalculations

@CompileTimeCalculation fun compareTo(value: Long, other: Byte) = value.compareTo(other)
@CompileTimeCalculation fun compareTo(value: Long, other: Short) = value.compareTo(other)
@CompileTimeCalculation fun compareTo(value: Long, other: Int) = value.compareTo(other)
@CompileTimeCalculation fun compareTo(value: Long, other: Long) = value.compareTo(other)
@CompileTimeCalculation fun compareTo(value: Long, other: Float) = value.compareTo(other)
@CompileTimeCalculation fun compareTo(value: Long, other: Double) = value.compareTo(other)

@CompileTimeCalculation fun plus(value: Long, other: Byte) = value.plus(other)
@CompileTimeCalculation fun plus(value: Long, other: Short) = value.plus(other)
@CompileTimeCalculation fun plus(value: Long, other: Int) = value.plus(other)
@CompileTimeCalculation fun plus(value: Long, other: Long) = value.plus(other)
@CompileTimeCalculation fun plus(value: Long, other: Float) = value.plus(other)
@CompileTimeCalculation fun plus(value: Long, other: Double) = value.plus(other)

@CompileTimeCalculation fun minus(value: Long, other: Byte) = value.minus(other)
@CompileTimeCalculation fun minus(value: Long, other: Short) = value.minus(other)
@CompileTimeCalculation fun minus(value: Long, other: Int) = value.minus(other)
@CompileTimeCalculation fun minus(value: Long, other: Long) = value.minus(other)
@CompileTimeCalculation fun minus(value: Long, other: Float) = value.minus(other)
@CompileTimeCalculation fun minus(value: Long, other: Double) = value.minus(other)

@CompileTimeCalculation fun times(value: Long, other: Byte) = value.times(other)
@CompileTimeCalculation fun times(value: Long, other: Short) = value.times(other)
@CompileTimeCalculation fun times(value: Long, other: Int) = value.times(other)
@CompileTimeCalculation fun times(value: Long, other: Long) = value.times(other)
@CompileTimeCalculation fun times(value: Long, other: Float) = value.times(other)
@CompileTimeCalculation fun times(value: Long, other: Double) = value.times(other)

@CompileTimeCalculation fun div(value: Long, other: Byte) = value.div(other)
@CompileTimeCalculation fun div(value: Long, other: Short) = value.div(other)
@CompileTimeCalculation fun div(value: Long, other: Int) = value.div(other)
@CompileTimeCalculation fun div(value: Long, other: Long) = value.div(other)
@CompileTimeCalculation fun div(value: Long, other: Float) = value.div(other)
@CompileTimeCalculation fun div(value: Long, other: Double) = value.div(other)

@CompileTimeCalculation fun rem(value: Long, other: Byte) = value.rem(other)
@CompileTimeCalculation fun rem(value: Long, other: Short) = value.rem(other)
@CompileTimeCalculation fun rem(value: Long, other: Int) = value.rem(other)
@CompileTimeCalculation fun rem(value: Long, other: Long) = value.rem(other)
@CompileTimeCalculation fun rem(value: Long, other: Float) = value.rem(other)
@CompileTimeCalculation fun rem(value: Long, other: Double) = value.rem(other)

@CompileTimeCalculation fun inc(value: Long) = value.inc()
@CompileTimeCalculation fun dec(value: Long) = value.dec()

@CompileTimeCalculation fun unaryPlus(value: Long) = value.unaryPlus()
@CompileTimeCalculation fun unaryMinus(value: Long) = value.unaryMinus()

@CompileTimeCalculation fun rangeTo(value: Long, other: Byte) = value.rangeTo(other)
@CompileTimeCalculation fun rangeTo(value: Long, other: Short) = value.rangeTo(other)
@CompileTimeCalculation fun rangeTo(value: Long, other: Int) = value.rangeTo(other)
@CompileTimeCalculation fun rangeTo(value: Long, other: Long) = value.rangeTo(other)

@CompileTimeCalculation fun shl(value: Long, bitCount: Int) = value.shl(bitCount)
@CompileTimeCalculation fun shr(value: Long, bitCount: Int) = value.shr(bitCount)
@CompileTimeCalculation fun ushr(value: Long, bitCount: Int) = value.ushr(bitCount)

@CompileTimeCalculation fun and(value: Long, other: Long) = value.and(other)
@CompileTimeCalculation fun or(value: Long, other: Long) = value.or(other)
@CompileTimeCalculation fun xor(value: Long, other: Long) = value.xor(other)
@CompileTimeCalculation fun inv(value: Long) = value.inv()

@CompileTimeCalculation fun toByte(value: Long) = value.toByte()
@CompileTimeCalculation fun toChar(value: Long) = value.toChar()
@CompileTimeCalculation fun toShort(value: Long) = value.toShort()
@CompileTimeCalculation fun toInt(value: Long) = value.toInt()
@CompileTimeCalculation fun toLong(value: Long) = value.toLong()
@CompileTimeCalculation fun toFloat(value: Long) = value.toFloat()
@CompileTimeCalculation fun toDouble(value: Long) = value.toDouble()

@CompileTimeCalculation fun toString(value: Long) = value.toString()
@CompileTimeCalculation fun hashCode(value: Long) = value.hashCode()
@CompileTimeCalculation fun equals(value: Long, other: Long) = value.equals(other)

@CompileTimeCalculation fun echo(value: Any) = value

const val min = echo(Long.MIN_VALUE) as Long
const val max = echo(Long.MAX_VALUE) as Long
const val bytes = echo(Long.SIZE_BYTES) as Int
const val bits = echo(Long.SIZE_BITS) as Int

const val compare1 = compareTo(5L, 1.toByte())
const val compare2 = compareTo(5L, 2.toShort())
const val compare3 = compareTo(5L, 3)
const val compare4 = compareTo(5L, 4L)
const val compare5 = compareTo(5L, 5.toFloat())
const val compare6 = compareTo(5L, 6.toDouble())

const val plus1 = plus(5L, 1.toByte())
const val plus2 = plus(5L, 2.toShort())
const val plus3 = plus(5L, 3)
const val plus4 = plus(5L, 4L)
const val plus5 = plus(5L, 5.toFloat())
const val plus6 = plus(5L, 6.toDouble())

const val minus1 = minus(5L, 1.toByte())
const val minus2 = minus(5L, 2.toShort())
const val minus3 = minus(5L, 3)
const val minus4 = minus(5L, 4L)
const val minus5 = minus(5L, 5.toFloat())
const val minus6 = minus(5L, 6.toDouble())

const val times1 = times(5L, 1.toByte())
const val times2 = times(5L, 2.toShort())
const val times3 = times(5L, 3)
const val times4 = times(5L, 4L)
const val times5 = times(5L, 5.toFloat())
const val times6 = times(5L, 6.toDouble())

const val div1 = div(100L, 1.toByte())
const val div2 = div(100L, 2.toShort())
const val div3 = div(100L, 4)
const val div4 = div(100L, 10L)
const val div5 = div(100L, 25.toFloat())
const val div6 = div(100L, 50.toDouble())

const val rem1 = rem(5L, 1.toByte())
const val rem2 = rem(5L, 2.toShort())
const val rem3 = rem(5L, 3)
const val rem4 = rem(5L, 4L)
const val rem5 = rem(5L, 5.toFloat())
const val rem6 = rem(5L, 6.toDouble())

const val increment = inc(3L)
const val decrement = dec(3L)

const val unaryPlus = unaryPlus(3L)
const val unaryMinus = unaryMinus(3L)

const val rangeTo1 = rangeTo(5L, 1.toByte()).last
const val rangeTo2 = rangeTo(5L, 2.toShort()).last
const val rangeTo3 = rangeTo(5L, 3).last
const val rangeTo4 = rangeTo(5L, 4L).last

const val shiftLeft = shl(8L, 1)
const val shiftRight = shr(8L, 2)
const val unsignedShiftRight = ushr(-8L, 3)

const val and = and(8L, 1L)
const val or = or(8L, 2L)
const val xor = xor(-8L, 3L)
const val inv = inv(8L)

const val a1 = toByte(1L)
const val a2 = toChar(2L)
const val a3 = toShort(3L)
const val a4 = toInt(4L)
const val a5 = toLong(5L)
const val a6 = toFloat(6L)
const val a7 = toDouble(7L)

const val b1 = toString(10L)
const val b2 = hashCode(10L)
const val b3 = equals(10L, 11L)
const val b4 = equals(1L, 1.toLong())
const val b5 = equals(1L, 1)