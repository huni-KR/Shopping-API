## [Github Commit Message Rule](https://junhyunny.github.io/information/github/git-commit-message-rule/)

        타입(Type): 제목(Subject)

        본문(Body)

        꼬리말(Footer)

### Type
- Feat - 새로운 기능 추가
- Fix - 버그 수정
- Build - 빌드 관련 파일 수정
- Ci - CI관련 설정 수정
- Docs - 문서 (문서 추가, 수정, 삭제)
- Style - 스타일 (코드 형식)
- Refactor - 코드 리팩토링
- Test - 테스트 (테스트 코드 추가, 수정, 삭제)
- Chore - 기타 변경사항 (빌드 스크립트 수정 등)

### Subject
- 제목은 50자를 넘기지 않고, 마침표를 붙이지 않습니다.
- 제목에는 commit 타입을 함께 작성합니다.
- 과거 시제를 사용하지 않고 명령조로 작성합니다.
- 제목과 본문은 한 줄 띄워 분리합니다.
- 제목의 첫 글자는 반드시 대문자로 씁니다.
- 제목이나 본문에 이슈 번호(가 있다면) 붙여야 합니다.


### Body
- 선택 사항이기에 모든 commit에 본문 내용을 작성할 필요는 없습니다.
- 한 줄에 72자를 넘기면 안 됩니다.
- 어떻게(How)보다 무엇을, 왜(What, Why)에 맞춰 작성합니다.
- 설명뿐만 아니라, commit의 이유를 작성할 때에도 씁니다.

### Footer
- 선택 사항이므로 모든 commit에 꼬리말을 작성할 필요는 없습니다.
- Issue tracker ID를 작성할 때 사용합니다.
- 해결: 이슈 해결 시 사용
- 관련: 해당 commit에 관련된 이슈 번호
- 참고: 참고할 이슈가 있는 경우 사용