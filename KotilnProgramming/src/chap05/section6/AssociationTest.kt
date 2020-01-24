//package chap05.section6
//
//class Patient (val name: String) {
//    fun doctorList (d: Doctor) {
//        println("Patient: $name, Doctor: ${d.name}")
//    }
//}
//
//class Doctor(val name: String) {
//    fun patientList(p: Patient) {
//        println("Doctor: $name, Patient: ${p.name}")
//    }
//}
//
//fun main() {
//    // 연관관계
//    val doc1 = Doctor("KimSabu") // 객체가 따로 생성됨.
//    // 독립적인 생명주기를 가짐.
//    val patient1 = Patient("lowell")
//    doc1.patientList(patient1)
//    patient1.doctorList(doc1)
//}