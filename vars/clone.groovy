def call(String url,String branch) {
  echo "This is the cloning of the Code"

  git url: "${url}", branch: "${branch}"
  echo "Code cloned SUccessfully"
}
