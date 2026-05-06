document.addEventListener('DOMContentLoaded', function() {
    // 获取元素
    const tag1 = document.getElementById("How-we-did");
    const tag2 = document.getElementById("thankyou");
    const tag3 = document.getElementById("submit-btn");
    // 给按钮绑定点击事件
    tag3.addEventListener("click", function() {
    tag1.style.display = "none";
    tag2.style.display = "flex";
  });
});