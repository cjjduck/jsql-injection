/*******************************************************************************
 * Copyhacked (H) 2012-2014.
 * This program and the accompanying materials
 * are made available under no term at all, use it like
 * you want, but share and discuss about it
 * every time possible with every body.
 * 
 * Contributors:
 *      ron190 at ymail dot com - initial implementation
 ******************************************************************************/
package com.jsql.view.swing.shell;

import java.util.UUID;

import com.jsql.model.accessible.RessourceAccess;

/**
 * A terminal for web shell injection.
 */
@SuppressWarnings("serial")
public class ShellWeb extends AbstractShell {
    /**
     * Build a webshell instance.
     * @param terminalID Unique identifier to discriminate beyond multiple opened terminals
     * @param urlShell URL of current shell
     */
    public ShellWeb(UUID terminalID, String urlShell) {
        super(terminalID, urlShell, "terminal");
    }

    @Override
    void action(String command, UUID terminalID, String urlShell, String... arg) {
        RessourceAccess.runWebShell(command, terminalID, urlShell);
    }
}