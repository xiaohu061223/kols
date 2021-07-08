package org.javacs.factory

import org.javacs.lsp.LanguageClient
import org.javacs.lsp.LanguageServer
import org.javacs.lsp.impl.KotlinCompiler
import org.javacs.lsp.impl.KotlinLanguageServer

object LanguageServerFactory {
    fun createKotlin(): LanguageServer = KotlinLanguageServer(LanguageClient(), KotlinCompiler())
}
