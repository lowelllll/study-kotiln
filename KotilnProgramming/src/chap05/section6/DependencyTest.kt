package chap05.section6

class Patient (val name: String, var id: Int) {
    fun doctorList (d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) { // Patient에 의존
    val customerId: Int = p.id

    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    // 의존관계
    val patient1 = Patient("lowell", 123)

    val doc1 = Doctor("KimSabu", patient1)
    doc1.patientList(patient1)
}