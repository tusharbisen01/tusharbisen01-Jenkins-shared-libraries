def call(string url, string branch){
  echo "This is the cloning stage"
  git url: "${url}", branch: "{$branch}"
  echo "Code cloning successfull"
}
