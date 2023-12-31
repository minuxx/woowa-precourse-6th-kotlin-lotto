# 로또 게임

## 프로젝트 개요
프로젝트의 목표는 로또 게임을 구현하는 것이다.  
로또 게임 프로그램은 사용자가 금액을 입력하면 해당 금액에 따라 로또를 발행하고,   
사용자에게 당첨 번호와 보너스 번호를 입력받아 발행된 로또와 당첨 번호를 비교하여 당첨 내역 및 수익률을 계산한다.


## 구현 기능 목록
### Model
- - -
**Lotto**
  - ✅ 6개의 번호를 가진 로또를 생성한다.
  - ✅ (E) 번호의 개수가 6개가 아닐 경우 예외를 발생시킨다.
  - ✅ (E) 번호의 범위가 1~45의 범위가 아닐 경우 예외를 발생시킨다.
  - ✅ (E) 중복된 번호가 있을 경우 예외를 발생시킨다.


**Bonus** 
  - ✅ 1개의 보너스 번호를 생성한다.
  - ✅ (E) 번호의 범위가 1~45의 범위가 아닐 경우 예외를 발생시킨다.
  - ✅ (E) 당첨 번호와 중복되었을 경우 예외를 발생시킨다.


**Purchase**
  - ✅ 구매 금액을 생성한다.
  - ✅ (E) 유효하지 않은 금액 단위에 대해 예외를 발생시킨다.
    - 1,000원 단위


**Publisher**
  - ✅ 구입하려는 로또 개수만큼 로또를 발행한다.


**WinningRank**
  - ✅ 당첨 번호 개수와 보너스 번호에 해당하는 등수를 찾는다.
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원


**WinningRecord**
  - ✅ 당첨 내역을 기록한다.
  - ✅ 구매 로또와 당첨 로또를 비교해 일치하는 번호 개수를 계산한다.
  - ✅ 구매 로또와 보너스 번호를 비교한다.


**ProfitRate**
  - ✅ 총 당첨 금액을 계산한다.
  - ✅ 수익률을 계산한다.
    - 소수점 둘째자리에서 반올림
 

### View
- - -
**InputView** 
  - ✅ 로또 구입 금액을 입력받는다.
    - ✅ (E) 유효하지 않은 입력에 대해 예외를 발생시킨다.
      - 빈 문자열
      - 숫자가 아닌 문자


  - ✅ 당첨 번호 6개를 입력받는다.
    - ✅ (E) 유효하지 않은 입력에 대해 예외를 발생시킨다.
      - 빈 문자열
      - 구분자(,) 외 숫자가 아닌 문자


  - ✅ 보너스 번호 1개를 입력받는다.
    - ✅ (E) 유효하지 않은 입력에 대해 예외를 발생시킨다.
      - 빈 문자열
      - 숫자가 아닌 문자


**OutputView**
  - ✅ 발행한 로또 개수와 번호를 출력한다.
    - 각 로또 번호는 오름차순 정렬
  - ✅ 당첨 내역을 출력한다.
    - 보너스 번호 없는 경우 - {당첨 번호 개수}개 일치 ({당첨 금액}원) - {당첨 개수}개
    - 보너스 번호 있는 경우 - {당첨 번호 개수}개 일치, 보너스 볼 일치 ({당첨 금액}원) - {당첨 개수}개
  - ✅ 수익률을 소수점 첫째 자리까지 출력한다.
  - ✅ 에러 메세지를 출력한다.
    - [ERROR] 접두사 포함한 메세지 출력


### Controller
- - -
**LottoGame**
  - ✅ 로또 구입 금액 입력을 요청한다.
  - ✅ 구입 금액만큼 로또를 발행을 요청한다.
  - ✅ 구입한 로또 출력을 요청한다.
  - ✅ 당첨 번호를 입력 요청한다.
  - ✅ 보너스 번호를 입력 요청한다.
  - ✅ 당첨 내역 계산을 요청한다.
  - ✅ 당첨 내역 출력을 요청한다.
  - ✅ 수익률 계산을 요청한다.
  - ✅ 수익률 출력을 요청한다.
  - ✅ 입력 예외 발생 시 재입력을 요청한다.
