// clear hết giá trị
function clearScreen(){
    document.getElementById("result").value = "";
}
// hiển thị giá trị nhập vào
function display(value) {
    document.getElementById("result").value += value;
}
// tính toán và trả về kết quả
function calculate() {
    let p = document.getElementById("result").value;
    let q = eval (p);
    document.getElementById("result").value = q;
}