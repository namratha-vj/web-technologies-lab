const chatBody = document.getElementById("chat-body");
const chatInput = document.getElementById("chat-input");
const chatSendBtn = document.getElementById("chat-send-btn");

chatSendBtn.addEventListener("click", sendMessage);

function sendMessage() {
  const message = chatInput.value.trim();
  if (message !== "") {
    const newMessage = document.createElement("div");
    newMessage.classList.add("chat-message");
    newMessage.textContent = message;
    chatBody.appendChild(newMessage);
    chatInput.value = "";
  }
}
