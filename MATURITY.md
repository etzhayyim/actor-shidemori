# shidemori (死出守) — Maturity Ledger

`/loop` 進捗台帳。各イテレーションで成熟度を上げ、ここに記録する。honest framing:
できていないことは「未」と明記する。

- Actor: `did:web:shidemori.etzhayyim.com` · ADR-2605263800 · **R0 scaffold**
- 不変条件(全イテレーション厳守): R0 では cell 非実行 · dispatch なし ·
  NON-mortuary / non-commercial / non-legal-advice 境界(G14, ADR-2605263800) ·
  PII平文禁止 · Murakumo-only · G8 非捏造 · コミットはユーザー明示時のみ

## イテレーション記録

- 2026-06-02 registry hardening: the death-registration seed contains 130 entries / 31 jurisdictions with fail-closed `unverified-seed` status. The canonical dataset is now `registry/registries.seed.edn`; its external JSON projection is `wire/registries.seed.json`. See `registry/VERIFICATION.md` for the human verification gates.

### 2026-06-17 (loop) — manifest+lexicon charter-gate test (構造ゲート pin)
既存 registry-seed テストが被覆していなかった **manifest G1–G13 + 5 lexicon の dignity ゲート(ロスター最密 const 台帳)**を `test/shidemori/methods/test_charter_gates.cljk` で固定する。canonical `manifest.edn` と `lex/*.edn` を直接検証し、外部交換用 JSON は `wire/` に隔離する。

> **2026-07-17 multirepo migration:** the charter-gate test is Clojure/EDN-only (`test/shidemori/methods/test_charter_gates.cljk`). Run the standalone suite with `bb --classpath src:test run_tests.cljk`.
