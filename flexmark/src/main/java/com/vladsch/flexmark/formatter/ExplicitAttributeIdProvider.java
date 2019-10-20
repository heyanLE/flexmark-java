package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.ast.Node;

public interface ExplicitAttributeIdProvider {
    /**
     * Used by AttributesExtension to insert attributes for headings during merge
     *
     * @param node
     * @param id
     * @param context
     * @param markdown
     */
    void addExplicitId(Node node, String id, NodeFormatterContext context, MarkdownWriter markdown);
}