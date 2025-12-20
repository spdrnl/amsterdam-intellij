#!/usr/bin/env bash
set -euo pipefail

# Generate ANTLR4 Python3 parser/lexer + visitor for OwlDsl.g4
# Output to the active package path used by the runtime: src/ams/to_ttl/parser

mkdir -p src/ams/to_ttl/parser

# Prefer the `antlr4` launcher if present; fall back to invoking via Java class
if command -v antlr4 >/dev/null 2>&1; then
  antlr4 -Dlanguage=Python3 -visitor -no-listener OwlDsl.g4 -o src/ams/to_ttl/parser
else
  java org.antlr.v4.Tool -Dlanguage=Python3 -visitor -no-listener src/main/antlr/OwlDsl.g4 -o gen/com/github/spdrnl/amsterdamintellij/parser
fi

echo "Generated OwlDsl lexer/parser under src/ams/to_ttl/parser"